package com.test.eurekaclientcomsumerfeignhystrix.config;

import com.test.eurekaclientcomsumerfeignhystrix.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("eureka-provider")  //使用虚拟主机名
public interface UserFeignClient {
    //value的值必须和被调用者(eureka-provider)中的方法名一致
    @RequestMapping(method = RequestMethod.GET, value = "/getUser/{id}")
    User findById(@PathVariable("id") int id);
}
