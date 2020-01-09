package com.test.nacosclientconsumer.controller.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("springcloud-nacos-discovery-provider")
public interface ProviderClient {
    @GetMapping("/test/{name}")
    String test(@PathVariable String name);
}
