package com.klt.springcloud.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BootController {

    @RequestMapping("hello")
    public String hello(){
        return "hello world";
    }
}
