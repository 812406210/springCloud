package com.test.eurekaclientcomsumerribbon.controller;


import com.test.eurekaclientcomsumerribbon.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;

@RestController
public class ConsumerUserController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${user.httpAddress}")
    private String userHttpAddress;

    @RequestMapping("/getUser/{id}")
    public User getUserById(@PathVariable int id, HttpServletRequest request){
        System.out.println(request.getRemotePort());
        return this.restTemplate.getForObject(userHttpAddress+id,User.class);
    }
}
