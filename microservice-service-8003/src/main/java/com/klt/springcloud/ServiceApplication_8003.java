package com.klt.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ServiceApplication_8003 {
    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication_8003.class,args);
    }
}
