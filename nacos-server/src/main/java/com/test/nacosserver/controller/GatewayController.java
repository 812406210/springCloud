package com.test.nacosserver.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GatewayController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/get")
    public String get() {
        return "get gateway "+port;
    }


    @RequestMapping("/set")
    public String set() {
        return "set gateway "+port;
    }

}
