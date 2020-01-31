package com.lp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class AppEurekaZuulFilter {

	public static void main(String[] args) {
		SpringApplication.run(AppEurekaZuulFilter.class, args);
	}
}
