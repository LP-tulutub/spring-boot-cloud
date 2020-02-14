package com.lp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 1、将服务提供者注册到注册中心
 * 	    1、引入dubbo和zkclient相关依赖
 * 	    2、配置dubbo的扫描包和注册中心地址
 * 	    3、使用@Service发布服务
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class AppZookeeperConsumer {

	public static void main(String[] args) {
		SpringApplication.run(AppZookeeperConsumer.class, args);
	}

	@Bean
	@LoadBalanced
	RestTemplate loadBalancedRestTemplate() {
		return new RestTemplate();
	}

}
