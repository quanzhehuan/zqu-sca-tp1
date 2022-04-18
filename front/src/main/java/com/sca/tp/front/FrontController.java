package com.sca.tp.front;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class FrontController {

    private static final String GET = "http://back:8080/";
    private static final String POST = "http://back:8080/";

    private RestTemplate restTemplate;
    private String msg;

    @GetMapping("/get")
    public String getFromBack(){
        restTemplate = new RestTemplate();
        msg = restTemplate.getForObject(GET, String.class);
        System.out.println(msg);
        return "FRONT GOT : " + msg + " BY GET REQUEST";
    }

    @PostMapping("/post")
    public String postToBack(){
        restTemplate = new RestTemplate();
        msg = restTemplate.getForObject(POST, String.class);
        System.out.println(msg);
        return "FRONT GOT : " + msg + " BY POST REQUEST";
    }
}
