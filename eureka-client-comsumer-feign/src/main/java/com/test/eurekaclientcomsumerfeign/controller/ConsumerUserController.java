package com.test.eurekaclientcomsumerfeign.controller;


import com.test.eurekaclientcomsumerfeign.config.UserFeignClient;
import com.test.eurekaclientcomsumerfeign.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class ConsumerUserController {

    @Autowired
    private UserFeignClient userFeignClient;

    @RequestMapping("/getUser/{id}")
    public User findById(@PathVariable int id, HttpServletRequest request){
       return userFeignClient.findById(id);
    }
}
