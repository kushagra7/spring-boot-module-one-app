package com.kushagra.module_one_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ModuleOneAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModuleOneAppApplication.class, args);
	}

	@GetMapping
	public String helloWorld(){
		return "Hello World in Spring Boot";
	}

}
