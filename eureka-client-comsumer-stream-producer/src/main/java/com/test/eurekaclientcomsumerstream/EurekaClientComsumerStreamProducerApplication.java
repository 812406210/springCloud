package com.test.eurekaclientcomsumerstream;

import com.test.eurekaclientcomsumerstream.config.ReadMsgInterface;
import com.test.eurekaclientcomsumerstream.config.SendMessageInterface;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableEurekaClient
@EnableBinding({SendMessageInterface.class, ReadMsgInterface.class}) //springcloud stream 生产者
public class EurekaClientComsumerStreamProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientComsumerStreamProducerApplication.class, args);
    }

}
