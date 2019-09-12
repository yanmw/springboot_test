package com.ceshishi.demo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

//    @PostMapping(value = "/hello")
    @GetMapping("/hello")
    public String hello(){
        return "爱你呦~";
    }
}
