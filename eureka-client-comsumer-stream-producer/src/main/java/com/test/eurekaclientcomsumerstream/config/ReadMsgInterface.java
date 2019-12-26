package com.test.eurekaclientcomsumerstream.config;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

//创建接受消息管道
public interface ReadMsgInterface {

    // 从管道中获取消息
    @Input("mymsg2")
    SubscribableChannel redMsg();
}
