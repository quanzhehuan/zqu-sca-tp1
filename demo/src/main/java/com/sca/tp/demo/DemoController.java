package com.sca.tp.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private static final String template = "This is a %s request.";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/")
    public String get(@RequestParam(value = "name", defaultValue = "GET") String name) {
        return "Hello from Back (get)";
    }

    @PostMapping("/")
    public String post(@RequestParam(value = "name", defaultValue = "POST") String name) {
        return "Hello from back (post)";
    }
}
