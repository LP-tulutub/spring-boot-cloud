package com.lp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class AppEurekaZuulFallback {

	public static void main(String[] args) {
		SpringApplication.run(AppEurekaZuulFallback.class, args);
	}
}
