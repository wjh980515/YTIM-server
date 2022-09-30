package com.example.ytimserver.server;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

//聊天服务器
@Component
public class NettyServer {

    private static Logger logger = LoggerFactory.getLogger(NettyServer.class);

    private final static Integer port = 8888;

    private static NioEventLoopGroup boss = new NioEventLoopGroup();
    private static NioEventLoopGroup worker = new NioEventLoopGroup();

    private static ServerBootstrap server = new ServerBootstrap();

    @PostConstruct
    public void run() {
        try {
            server.group(boss,worker);
            server.channel(NioServerSocketChannel.class);
            server.childHandler(new NettyServerInitializer());
            //获取异步结果
            ChannelFuture future = server.bind(port).sync();
            logger.info("服务器启动，端口为:" + port);
            future.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            logger.error("服务器错误,异常信息:" + e);
        } finally {
            boss.shutdownGracefully();
            worker.shutdownGracefully();
        }
    }

}
