package com.lp;

import com.lp.sender.DemoSendService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableEurekaClient
@EnableBinding(DemoSendService.class)
public class AppRabbitMQStreamProducerDemo {

	public static void main(String[] args) {
		SpringApplication.run(AppRabbitMQStreamProducerDemo.class, args);
	}
}
