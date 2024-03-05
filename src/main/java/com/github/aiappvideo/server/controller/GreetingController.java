package com.github.aiappvideo.server.controller;

import com.github.aiappvideo.server.service.GreetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/greet")
public class GreetingController
{

    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService)
    {
        this.greetingService = greetingService;
    }

    @GetMapping("/{name}")
    private Mono<String> greet(@PathVariable("name") String name)
    {
        return greetingService.greet(name);
    }
}
