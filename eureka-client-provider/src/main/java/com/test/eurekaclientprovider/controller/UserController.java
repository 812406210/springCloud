package com.test.eurekaclientprovider.controller;


import com.test.eurekaclientprovider.entity.User;
import com.test.eurekaclientprovider.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/getUser/{id}")
    public User getUserById(@PathVariable int id){

        System.out.println("111");
        return this.userRepository.getOne(id);
    }
}
