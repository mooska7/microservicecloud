package com.klt.springcloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("hello-service")
public interface HelloService {
    @RequestMapping("hello")
    String hello();

    @RequestMapping("whoAreYou")
    String whoImI(@RequestParam("name")String name);
}
