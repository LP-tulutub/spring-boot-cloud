package com.lp.controller;

import com.lp.sender.DemoSendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoProducerController {
    @Autowired
    private DemoSendService demoSendService;

    @RequestMapping(value="/send",method= RequestMethod.GET)
    public String sendRequest(){
        //创建消息
        Message msg = MessageBuilder.withPayload("hello world".getBytes()).build();
        //发送消息
        this.demoSendService.sendOrder().send(msg);
        return "SUCCESS";
    }

}
