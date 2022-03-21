package com.lt.crs.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Client2Controller {
	@Value("${server.port}")
	String message;
	@GetMapping("/client2")
	public String fun1() {
		System.out.println(message);
		return message+"is the port of CLIENT 2";
	}

}
