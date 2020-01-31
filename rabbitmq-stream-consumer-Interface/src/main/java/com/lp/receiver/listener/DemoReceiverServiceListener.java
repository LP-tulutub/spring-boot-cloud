package com.lp.receiver.listener;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.stereotype.Component;

@Component
public class DemoReceiverServiceListener {
    //订阅myInput通道的消息
    @StreamListener(Processor.INPUT)
    public void receive(byte[] msg){
        System.out.println("接收到的消息：" + new String(msg));
    }
}
