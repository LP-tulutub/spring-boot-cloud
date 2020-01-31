package com.lp.queue;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QueueFirst {

    /**
     * 创建队列
     * @return
     */
    @Bean
    public Queue queueOne(){
        return new Queue("first-queue");
    }

}
