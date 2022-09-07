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
            clienteRepository.save(new Cliente("José Mário"));
            clienteRepository.save(new Cliente("Ana Maria"));

            List<Cliente> todosClientes = clienteRepository.findAll();
            todosClientes.forEach(System.out::println);

            System.out.println("Atualizando clientes");
            todosClientes.forEach(c -> {
                c.setNome(c.getNome() + " atualizado.");
                clienteRepository.save(c);
            });

            todosClientes = clienteRepository.findAll();
            todosClientes.forEach(System.out::println);

            System.out.println("Buscando clientes");
            clienteRepository.findByNomeLike("J").forEach(System.out::println);

            System.out.println("deletando clientes");
            clienteRepository.findAll().forEach(c -> {
                clienteRepository.delete(c);
            });

            todosClientes = clienteRepository.findAll();
            if(todosClientes.isEmpty()){
                System.out.println("Nenhum cliente encontrado.");
            }else{
                todosClientes.forEach(System.out::println);
            }
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDatajpaApplication.class, args);
	}

}
