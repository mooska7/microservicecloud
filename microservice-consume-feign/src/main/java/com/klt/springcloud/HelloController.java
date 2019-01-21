package com.klt.springcloud;

import com.klt.springcloud.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {
    @Autowired
    HelloService helloService;
    @RequestMapping("hello")
    public String hello(){
        return helloService.hello();
    }

    @RequestMapping("whoImI")
    public String whoImI(){
        return helloService.whoImI("xihao");
    }
}
