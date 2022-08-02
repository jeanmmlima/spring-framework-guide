package com.jeanlima.vendas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //classe que vai iniciar um container spring
public class VendasApplication {

	public static void main(String[] args) {
		//recebe a classe e os argumentos
		SpringApplication.run(VendasApplication.class, args);
	}

}
