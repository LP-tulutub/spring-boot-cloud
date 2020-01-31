package com.lp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;

@SpringBootApplication
@EnableEurekaClient
@EnableBinding(Processor.class)
public class AppRabbitMQStreamConsumerInterface2 {

	public static void main(String[] args) {
		SpringApplication.run(AppRabbitMQStreamConsumerInterface2.class, args);
	}
}
