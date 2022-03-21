package com.lt.crs.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.lt.crs.model.Professor;
import com.lt.crs.repo.ProfessorRepo;

@EnableWebMvc
@EntityScan("com.lt.crs.model")
@EnableJpaRepositories("com.lt.crs.repo")
@ComponentScan("com.lt.crs.*")
@SpringBootApplication
public class InMemoryDataBaseSpringBootApplication {

	public static void main(String[] args) {
	//ConfigurableApplicationContext ctxt=
		SpringApplication.run(InMemoryDataBaseSpringBootApplication.class, args);
	
//	ProfessorRepo profRepo=ctxt.getBean(ProfessorRepo.class);
//	profRepo.save(new Professor("a","a"));
	
	
	}

}
