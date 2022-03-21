package com.lt.crs.controller;
import org.springframework.cloud.client.DefaultServiceInstance;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import java.util.Arrays;
import java.util.List;
import reactor.core.publisher.Flux;


public class SayHelloConfiguration {
	@Bean
	  @Primary
	  ServiceInstanceListSupplier serviceInstanceListSupplier() {
	    return new DemoServiceInstanceListSuppler("CLIENT2");
	  }
}
class DemoServiceInstanceListSuppler implements ServiceInstanceListSupplier {

	  private final String serviceId;

	  DemoServiceInstanceListSuppler(String serviceId) {
	    this.serviceId = serviceId;
	  }

	  @Override
	  public String getServiceId() {
	    return serviceId;
	  }

	  @Override
	  public Flux<List<ServiceInstance>> get() {
	    return Flux.just(Arrays
	        .asList(new DefaultServiceInstance(serviceId + "1", serviceId, "localhost", 7001, false),
	            new DefaultServiceInstance(serviceId + "2", serviceId, "localhost", 7002, false),
	            new DefaultServiceInstance(serviceId + "3", serviceId, "localhost", 7003, false)))
;
	  }
	}