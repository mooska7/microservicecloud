package com.klt.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ApiApplicayion {
    public static void main(String[] args) {
        SpringApplication.run(ApiApplicayion.class,args);
    }
}
