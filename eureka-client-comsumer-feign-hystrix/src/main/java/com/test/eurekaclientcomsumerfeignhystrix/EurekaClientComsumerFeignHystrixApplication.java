package com.test.eurekaclientcomsumerfeignhystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
@EnableCircuitBreaker   //hystrix的注解
public class EurekaClientComsumerFeignHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientComsumerFeignHystrixApplication.class, args);
    }

}
