package com.lt.crs.controller;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lt.crs.model.Professor;
import com.lt.crs.repo.ProfessorRepo;
import com.lt.crs.service.ProfessorServiceInterface;



@RestController
@RequestMapping("/")
public class ProfessorController {

	@Autowired
	private ProfessorServiceInterface professorService;
	
	@GetMapping("/hello1")
	public String helloFun1() {
		
	
		professorService.check();
		return "Hello Spring Security 1";
		
	}

	@GetMapping("/hello2")
	public String helloFun2() {
//		String originalUrl = "https://www.google.co.nz/?gfe_rd=cr&ei=dzbFV&gws_rd=ssl#q=java";
//		String encodedUrl = Base64.getUrlEncoder().encodeToString(originalUrl.getBytes());
//		System.out.println(encodedUrl);
		return "Hello Spring Security 2";
	}
}
