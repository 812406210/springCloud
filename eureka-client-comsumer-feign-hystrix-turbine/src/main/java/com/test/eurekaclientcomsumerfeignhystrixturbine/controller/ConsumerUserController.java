package com.test.eurekaclientcomsumerfeignhystrixturbine.controller;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.test.eurekaclientcomsumerfeignhystrixturbine.config.UserFeignClient;
import com.test.eurekaclientcomsumerfeignhystrixturbine.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerUserController {

    @Autowired
    private UserFeignClient userFeignClient;

    @RequestMapping("/getUser/{id}")
    @HystrixCommand(fallbackMethod = "defaultMethod",
            commandProperties = {
                    @HystrixProperty(name="execution.isolation.strategy", value="SEMAPHORE")
            }
    )
    public User findById(@PathVariable int id){
       return userFeignClient.findById(id);
    }

    /**
     * 一旦findById()没有找到就会执行这个,参数必须一致
     * @param id
     * @return
     */
    public User defaultMethod(@PathVariable("id") int id){
        User user = new User();
        user.setId(id);
        user.setPassword("hystrix");
        user.setAge(20+"");
        user.setPhoneNumber(1111+"");
        return user;
    }


}
