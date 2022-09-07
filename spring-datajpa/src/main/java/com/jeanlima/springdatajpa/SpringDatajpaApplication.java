package com.jeanlima.springdatajpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.jeanlima.springdatajpa.model.Cliente;
import com.jeanlima.springdatajpa.repository.ClienteRepository;

@SpringBootApplication
public class SpringDatajpaApplication {

	@Autowired 
	ClienteRepository clienteRepository;

	@Bean
	public CommandLineRunner init(){
		return args -> {
			System.out.println("Salvando clientes");
            clienteRepository.save(new Cliente("João Maria"));
            clienteRepository.save(new Cliente("Maria da Glória"));

            boolean existe = clienteRepository.existsByNome("José Mário");
            System.out.println("Existe cliente com o nome José? "+existe);

            List<Cliente> result = clienteRepository.encontrarPorNomeMod("Maria");
            result.forEach( System.out::println);
            
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDatajpaApplication.class, args);
	}

}
