package com.test.eurekaclientcomsumerstream.controller;

import com.test.eurekaclientcomsumerstream.config.SendMessageInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class SendMsgController {
    @Autowired
    private SendMessageInterface sendMessageInterface;

    /**
     * 发送消息
     * @return
     */
    @RequestMapping("/sendMsg")
    public String sendMsg() {
        String msg = UUID.randomUUID().toString();
        System.out.println("生产者发送内容msg:" + msg);
        Message build = MessageBuilder.withPayload(msg.getBytes()).build();
        sendMessageInterface.sendMsg().send(build);
        return "success";
    }

}
