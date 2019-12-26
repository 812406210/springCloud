package com.test.eurekaclientcomsumerstreamconsumer;

import com.test.eurekaclientcomsumerstreamconsumer.config.ReadMsgInterface;
import com.test.eurekaclientcomsumerstreamconsumer.config.SendMessageInterface;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableEurekaClient
@EnableBinding({ReadMsgInterface.class, SendMessageInterface.class}) //springcloud stream 消费者
public class EurekaClientComsumerStreamConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientComsumerStreamConsumerApplication.class, args);
    }

}
