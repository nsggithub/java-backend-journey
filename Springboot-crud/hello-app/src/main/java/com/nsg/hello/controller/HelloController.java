package com.nsg.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloController{

    @GetMapping("/hello")
    public String Hello(){
        return "Hello from spring boot";
    }
}