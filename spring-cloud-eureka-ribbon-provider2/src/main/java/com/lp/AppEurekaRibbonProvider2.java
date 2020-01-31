package com.lp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AppEurekaRibbonProvider2 {

	public static void main(String[] args) {
		SpringApplication.run(AppEurekaRibbonProvider2.class, args);
	}
}
