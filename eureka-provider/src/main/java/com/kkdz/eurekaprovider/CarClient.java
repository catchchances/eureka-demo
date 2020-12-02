package com.kkdz.eurekaprovider;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;


// @Service
@FeignClient(value = "spring-cloud-eureka-producer", fallback = CarClientHystrixFallback.class)
//该接口对应当前的微服务的id或name,为spring-cloud-eureka-producer
public interface CarClient {

    @PostMapping("/sellCar")
    String sellCar();
    
}
