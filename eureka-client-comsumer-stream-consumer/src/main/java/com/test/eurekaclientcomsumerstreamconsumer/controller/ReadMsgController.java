package com.test.eurekaclientcomsumerstreamconsumer.controller;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
public class ReadMsgController {

    /**
     * 读取消息
     * @param msg 消息体
     */
    @StreamListener("mymsg1")
    public void listener(String msg) {
        System.out.println("消费者获取生产消息-----1111:" + msg);
    }
}
