package com.test.nacosserver.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/test/{string}")
    public String test(@PathVariable String string) {
        System.out.println("被调用的应用端口："+port);
        return "Hello Nacos :" + string;
    }
}
