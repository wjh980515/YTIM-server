package com.example.ytimserver.server.handler;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.timeout.IdleStateEvent;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NettyServerHandler extends SimpleChannelInboundHandler<Msg> {

    //客户端连接上时进行的操作
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        log.info("客户端连接:{}",ctx.channel().remoteAddress());
        Msg msg = Msg.newBuilder().setId(2).setContent("hello client").build();
        ctx.writeAndFlush(msg);
    }

    //客户端发来消息后的操作
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Msg msg) throws Exception {
        log.info("收到的消息:{}",msg);
        ctx.writeAndFlush(msg);
    }

    //心跳机制 如果30s没有接收到客户端的消息就触发，触发两次断开连接
    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        if (evt instanceof IdleStateEvent){

        }
        super.userEventTriggered(ctx, evt);
    }

    //出现异常断开连接
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        super.exceptionCaught(ctx, cause);
        ctx.close();
    }
}
