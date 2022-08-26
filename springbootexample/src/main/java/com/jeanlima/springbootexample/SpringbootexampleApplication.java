package com.jeanlima.springbootexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

/*
 * Anotada com @SpringBootAplication
 * classe que vai iniciar uma aplicação spring boot
 */
@SpringBootApplication
@RestController
public class SpringbootexampleApplication {


	@GetMapping("/hello")
	public String helloWorld(){
		return "Olá, mundo!";
	}

	public static void main(String[] args) {
		/*
		 * Comando para iniciar a aplicação spring boot e é isso!
		 */
		SpringApplication.run(SpringbootexampleApplication.class, args);
	}

}
