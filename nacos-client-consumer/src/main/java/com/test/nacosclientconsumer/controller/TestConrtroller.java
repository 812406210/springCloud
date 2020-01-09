package com.test.nacosclientconsumer.controller;

import com.test.nacosclientconsumer.controller.service.ProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestConrtroller {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ProviderClient providerClient;

    /**
     * 方式一: 使用restTemplate
     * @param string
     * @return
     */
    @GetMapping("test/{string}")
    public String test(@PathVariable String string) {
        return restTemplate.getForObject("http://springcloud-nacos-discovery-provider/test/" + string, String.class);
    }

    /**
     * 方式二：使用openFeign
     * @param string
     * @return
     */
    @GetMapping("testFeign/{string}")
    public String testFeign(@PathVariable String string) {
        return providerClient.test("hello feign"+string);
    }
}