package com.github.aiappvideo.server.service;

import com.github.aiappvideo.core.services.ConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class GreetingService
{

    private ConfigurationService configurationService;

    public Mono<String> greet(String name)
    {
        return Mono.just(configurationService.start() + name);
    }

    @Autowired
    public void setConfigurationService(ConfigurationService configurationService)
    {
        this.configurationService = configurationService;
    }
}
