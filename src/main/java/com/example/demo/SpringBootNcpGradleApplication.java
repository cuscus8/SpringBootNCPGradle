package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@ComponentScan(basePackages="user.*")
public class SpringBootNcpGradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootNcpGradleApplication.class, args);
	}
	
	
	
	
	
}
