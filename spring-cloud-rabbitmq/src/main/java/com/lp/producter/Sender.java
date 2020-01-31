package com.lp.producter;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    /**
     * 发送到队列
     * @param msg
     */
    public void send(String msg){
        this.amqpTemplate.convertAndSend("first-queue", msg);
    }

}
