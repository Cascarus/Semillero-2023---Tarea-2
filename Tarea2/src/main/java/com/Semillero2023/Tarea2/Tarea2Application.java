package com.Semillero2023.Tarea2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Tarea2Application {

	public static void main(String[] args) {
		SpringApplication.run(Tarea2Application.class, args);
	}
	
	@GetMapping("/hello")
	public String getRoot(){
		return "Si llego";
	}

}
