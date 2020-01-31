package com.lp;

import com.lp.receiver.DemoReceiverService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableEurekaClient
@EnableBinding(DemoReceiverService.class)
public class AppRabbitMQStreamConsumerDemo {

	public static void main(String[] args) {
		SpringApplication.run(AppRabbitMQStreamConsumerDemo.class, args);
	}
}
