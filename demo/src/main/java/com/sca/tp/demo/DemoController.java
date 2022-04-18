package com.sca.tp.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.logging.Logger;

@RestController
public class DemoController {

    Logger logger = Logger.getLogger(DemoController.class.getName());

    @GetMapping("/")
    public String get(@RequestParam(value = "name", defaultValue = "GET") String name) {
        logger.info("Logger from back ");
        return "I'M BACKEND";
    }

    @PostMapping("/")
    public String post(@RequestParam(value = "name", defaultValue = "POST") String name) {
        logger.info("Logger from back ");
        return "I'M BACKEND";
    }
}
