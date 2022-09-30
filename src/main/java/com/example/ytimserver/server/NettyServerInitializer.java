package com.example.ytimserver.server;

import com.example.ytimserver.server.handler.NettyServerHandler;
import io.netty.channel.ChannelDuplexHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufEncoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32FrameDecoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32LengthFieldPrepender;
import io.netty.handler.timeout.IdleStateHandler;

public class NettyServerInitializer extends ChannelInitializer<SocketChannel> {
    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        //判断连接假死的handler 判断空闲时间是否过长
        ch.pipeline().addLast(new IdleStateHandler(5,0,0));
        //双向handler
        ch.pipeline().addLast(new ChannelDuplexHandler());
        //protobuf的handler
        ch.pipeline().addLast(new ProtobufVarint32FrameDecoder());
        ch.pipeline().addLast(new ProtobufDecoder(Msg.getDefaultInstance()));
        ch.pipeline().addLast(new ProtobufVarint32LengthFieldPrepender());
        ch.pipeline().addLast(new ProtobufEncoder());

        //业务处理的handler
        ch.pipeline().addLast(new NettyServerHandler());
    }
}
