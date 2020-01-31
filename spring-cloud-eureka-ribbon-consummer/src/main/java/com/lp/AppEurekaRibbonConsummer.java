package com.lp;

import com.lp.config.CustomConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;

@SpringBootApplication
@EnableEurekaClient
@RibbonClients(value = {
		@RibbonClient(name = "EUREKA-RIBBON-PROVIDER", configuration = CustomConfiguration.class)
})
public class AppEurekaRibbonConsummer {

	public static void main(String[] args) {
		SpringApplication.run(AppEurekaRibbonConsummer.class, args);
	}
}
