package com.lt.crs.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@EnableWebMvc
//@EnableEurekaClient
@EnableFeignClients("com.lt.crs.feignConfig")
@ComponentScan("com.lt.crs.*")
@SpringBootApplication
public class Client3Application {

	public static void main(String[] args) {
		SpringApplication.run(Client3Application.class, args);
	}
	
	@Bean
	//@LoadBalanced
	   public RestTemplate getRestTemplat() {
	      return new RestTemplate();
	   }
	
	//@LoadBalanced
//	  @Bean
//	  WebClient.Builder webClientBuilder() {
//	    return WebClient.builder();
//	  }

}
