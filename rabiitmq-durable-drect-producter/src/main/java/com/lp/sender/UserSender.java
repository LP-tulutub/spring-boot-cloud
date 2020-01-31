package com.lp.sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 消息发送者
 */
@Component
public class UserSender {

    @Autowired
    private AmqpTemplate amqpTemplate;
    //exchange 交换器名称
    @Value("${mq.config.exchange}")
    private String exchange;
    //rouTingKey 路由键
    @Value("${mq.config.queue.info.routing.key}")
    private String ruTingKeyInfo;
    @Value("${mq.config.queue.error.routing.key}")
    private String ruTingKeyError;


    public void senderInfo(String msg){
        //向消息队列发送消息
        //参数一：交换器名称。
        //参数二：路由键
        //参数三：消息
        System.out.println("sendInfo: "+msg);
        this.amqpTemplate.convertAndSend(this.exchange, this.ruTingKeyInfo, msg);
    }

    public void senderError(String msg){
        //向消息队列发送消息
        //参数一：交换器名称。
        //参数二：路由键
        //参数三：消息
        System.out.println("sendError: "+msg);
        this.amqpTemplate.convertAndSend(this.exchange, this.ruTingKeyError, msg);
    }


}
