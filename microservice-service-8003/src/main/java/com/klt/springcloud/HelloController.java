package com.klt.springcloud;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("hello")
    public String hello(){
        return "service_8003";
    }
    @RequestMapping("whoAreYou")
    public String whoAreYou(@RequestParam("name")String name){
        return "service_8003: "+ name;
    }
}
