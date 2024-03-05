package com.github.aiappvideo.server.webserver.factory;

import org.springframework.boot.web.embedded.netty.NettyReactiveWebServerFactory;
import org.springframework.boot.web.embedded.netty.NettyServerCustomizer;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.stereotype.Component;
import reactor.netty.http.server.HttpServer;

@Component("customNettyWebServerFactoryCustomizer")
public class NettyWebServerFactoryCustomizer implements WebServerFactoryCustomizer<NettyReactiveWebServerFactory>
{

    @Override
    public void customize(NettyReactiveWebServerFactory serverFactory)
    {
        serverFactory.setPort(8080);
    }

    private record PortCustomizer(int port) implements NettyServerCustomizer
        {

            @Override
            public HttpServer apply(HttpServer httpServer)
            {
                return httpServer.port(port);
            }
        }
}
