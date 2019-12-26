package com.test.eurekaclientcomsumerstreamconsumer.config;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.SubscribableChannel;

//创建发送消息管道
public interface SendMessageInterface {
    // 创建一个输出管道，用于发送消息
    @Output("mymsg2")
    SubscribableChannel sendMsg();
}
