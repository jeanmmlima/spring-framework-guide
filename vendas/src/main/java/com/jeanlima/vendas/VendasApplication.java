package com.jeanlima.vendas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication //classe que vai iniciar um container spring
@RestController //vem da dependencia starter-web
public class VendasApplication {

	@GetMapping("/hello")
	public String helloWorld(){
		return "hello world";
	}

	public static void main(String[] args) {
		//recebe a classe e os argumentos
		SpringApplication.run(VendasApplication.class, args);
	}

}
