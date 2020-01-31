package com.lp.consummer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    /**
     * 接收者
     * @param msg
     */
    @RabbitListener(queues = "first-queue")
    public void process(String msg){
        System.out.println(msg);
    }

}
