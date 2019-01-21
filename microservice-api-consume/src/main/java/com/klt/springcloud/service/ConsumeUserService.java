package com.klt.springcloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("api-service")
public interface ConsumeUserService extends UserService {
}
