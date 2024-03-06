package com.github.aiappvideo.servertemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.github.aiappvideo"})
public class ServerConfigApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(ServerConfigApplication.class, args);
    }
}
