package com.myapp.firstboot.springdockerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/testcontainer")
public class SpringdockerdemoApplication {

	@GetMapping
	public  String applicationStatus() {
		return "Hello welcome to Springboot Container";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringdockerdemoApplication.class, args);
	}

}
