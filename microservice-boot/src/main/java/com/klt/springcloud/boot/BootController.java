package com.klt.springcloud.boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BootController {
    @Value("${test.name}")
    private String name;

    @RequestMapping("hello")
    public String hello(){
        return "hello world" + name;
    }
}
