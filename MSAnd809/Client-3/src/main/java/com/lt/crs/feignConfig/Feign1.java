package com.lt.crs.feignConfig;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(name="CLIENT2")
public interface Feign1 {

//	@RequestMapping(method = RequestMethod.GET, value = "/client2")
	@GetMapping("/client2")
	public String fun1();
}

