package com.lt.crs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import com.lt.crs.feignConfig.Feign1;
import org.springframework.cloud.client.loadbalancer.reactive.ReactorLoadBalancerExchangeFilterFunction;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import reactor.core.publisher.Mono;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;

import java.util.*;


@RestController
@RequestMapping("/")
//@LoadBalancerClient(name="lb1",configuration=LB1Configuration.class)
@LoadBalancerClient(name = "CLIENT2", configuration = SayHelloConfiguration.class)
public class Client1Controller {
	
	
	@Autowired
	private DiscoveryClient discoveryClient;
	
	@Autowired
	private Feign1 feign1;
	
	@Autowired
	RestTemplate restTemplate;

	@Value("${server.port}")
	String message;
	
	//private final WebClient.Builder loadBalancedWebClientBuilder;
	  private final ReactorLoadBalancerExchangeFilterFunction lbFunction;

	  public Client1Controller(
			  //WebClient.Builder webClientBuilder,
	      ReactorLoadBalancerExchangeFilterFunction lbFunction) {
	   // this.loadBalancedWebClientBuilder = webClientBuilder;
	    this.lbFunction = lbFunction;
	  }
	
	@GetMapping("/client1")
	public Mono<String> fun1() {
//		List<ServiceInstance> instances = discoveryClient.getInstances("CLIENT2");
//		//System.out.println(instances);
//		ServiceInstance serviceInstance = instances.get(0);
//		
//		String baseUrl = serviceInstance.getUri().toString();
//		baseUrl = baseUrl + "/client2";
//		
//		System.out.println(baseUrl);
//		String msgFromClient2=restTemplate.getForObject(baseUrl, String.class);

		//return "msgFromClient2";
		//return "CLIENT 1";
		return WebClient.builder()
		        .filter(lbFunction)
		        .build().get().uri("http://CLIENT2/client2")
		        .retrieve().bodyToMono(String.class);
	}
	
	
	@GetMapping("/client1a")
	//@CircuitBreaker(name="orderService",fallbackMethod="fallbackFeign1")
	@Retry(name="orderService",fallbackMethod="fallbackFeign1")
	public String fun1a() {
		
		String msg=feign1.fun1();
	
		return msg ;
	}
	
	public String fallbackFeign1(Exception e) {
		System.out.println(e);
		return "server will back soon";
	}

}
