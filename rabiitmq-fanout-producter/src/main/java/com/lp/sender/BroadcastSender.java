package com.lp.sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 消息发送者
 */
@Component
public class BroadcastSender {

    @Autowired
    private AmqpTemplate amqpTemplate;
    //exchange 交换器名称
    @Value("${mq.config.exchange}")
    private String exchange;


    public void senderInfo(String msg){
        //向消息队列发送消息
        //参数一：交换器名称。
        //参数二：路由键
        //参数三：消息
        System.out.println("sendInfo: "+msg);
        this.amqpTemplate.convertAndSend(this.exchange, "", "Broadcast————"+msg);
    }

    public void senderError(String msg){
        //向消息队列发送消息
        //参数一：交换器名称。
        //参数二：路由键
        //参数三：消息
        System.out.println("sendError: "+msg);
        this.amqpTemplate.convertAndSend(this.exchange, "", "Broadcast————"+msg);
    }

    public void senderBroadcast(String msg){
        //向消息队列发送消息
        //参数一：交换器名称。
        //参数二：路由键
        //参数三：消息
        this.amqpTemplate.convertAndSend(this.exchange, "", "Broadcast————"+msg);
    }
}
