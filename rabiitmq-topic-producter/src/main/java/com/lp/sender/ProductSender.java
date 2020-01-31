package com.lp.sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 消息发送者
 */
@Component
public class ProductSender {

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
        this.amqpTemplate.convertAndSend(this.exchange, "product.log.info", "product.sender.info————"+msg);
    }

    public void senderError(String msg){
        //向消息队列发送消息
        //参数一：交换器名称。
        //参数二：路由键
        //参数三：消息
        this.amqpTemplate.convertAndSend(this.exchange, "product.log.error", "product.sender.error————"+msg);
    }

    public void senderSome(String msg){
        //向消息队列发送消息
        //参数一：交换器名称。
        //参数二：路由键
        //参数三：消息
        this.amqpTemplate.convertAndSend(this.exchange, "product.log.info", "product.sender.info————"+msg);
        this.amqpTemplate.convertAndSend(this.exchange, "product.log.error", "product.sender.error————"+msg);
        this.amqpTemplate.convertAndSend(this.exchange, "product.log.warn", "product.sender.warn————"+msg);
        this.amqpTemplate.convertAndSend(this.exchange, "product.log.debug", "product.sender.debug————"+msg);
    }



}
