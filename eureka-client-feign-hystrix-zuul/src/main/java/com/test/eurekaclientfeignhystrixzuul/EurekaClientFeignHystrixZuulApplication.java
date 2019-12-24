package com.test.eurekaclientfeignhystrixzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker
@EnableZuulProxy
/*
    方式一:
*       zuul使用只需添加注解即可
*       1、http://localhost:7014/eureka-provider/getUser/2  通过添加外部接口项目名访问
*       2、http://localhost:7014/getUser/2  原始访问方式
*   方式二:
        自定义路径访问,需要在application.yml中配置，使用zuul配置别名
        1、http://localhost:7014/myuser/getUser/2  相当于将eureka-provider替换为myuser

    问题：
        使用了zuul貌似hystrix使用不了，目前在排查
*
*/
public class EurekaClientFeignHystrixZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientFeignHystrixZuulApplication.class, args);
    }

}
