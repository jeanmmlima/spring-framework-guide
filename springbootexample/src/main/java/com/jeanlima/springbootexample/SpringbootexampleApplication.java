package com.jeanlima.springbootexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * Anotada com @SpringBootAplication
 * classe que vai iniciar uma aplicação spring boot
 */
@SpringBootApplication
public class SpringbootexampleApplication {

	public static void main(String[] args) {
		/*
		 * Comando para iniciar a aplicação spring boot e é isso!
		 */
		SpringApplication.run(SpringbootexampleApplication.class, args);
	}

}
