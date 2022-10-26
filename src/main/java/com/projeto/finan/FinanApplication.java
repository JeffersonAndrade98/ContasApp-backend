package com.projeto.finan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class FinanApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinanApplication.class, args);
	}
	
	@GetMapping("")
	private String msg() {
		return "Iniciando projeto : )";
	}

}
