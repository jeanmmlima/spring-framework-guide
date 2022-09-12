package com.jeanlima.springdatajpa;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.jeanlima.springdatajpa.model.Cliente;
import com.jeanlima.springdatajpa.model.Pedido;
import com.jeanlima.springdatajpa.repository.ClienteRepository;
import com.jeanlima.springdatajpa.repository.PedidoRepository;

@SpringBootApplication
public class SpringDatajpaApplication {

	@Autowired 
	ClienteRepository clienteRepository;

	@Bean
	public CommandLineRunner init(@Autowired ClienteRepository clientes, @Autowired PedidoRepository pedidos){
		
		return args -> {
			/* System.out.println("Salvando clientes");
            clienteRepository.save(new Cliente("João Maria"));
            clienteRepository.save(new Cliente("Maria da Glória"));

            boolean existe = clienteRepository.existsByNome("José Mário");
            System.out.println("Existe cliente com o nome José? "+existe);

            List<Cliente> result = clienteRepository.encontrarPorNomeMod("Maria");
            result.forEach( System.out::println); */

			System.out.println("Salvando clientes");
            Cliente fulano = new Cliente("Fulano");
            clientes.save (fulano);

            Pedido p = new Pedido();
            p.setCliente(fulano);
            p.setDataPedido(LocalDate.now());
            p.setTotal(BigDecimal.valueOf(100));

            pedidos.save(p);

           /*  Cliente cliente = clientes.findClienteFetchPedidos(fulano.getId());
            System.out.println(cliente);
            System.out.println(cliente.getPedidos()); */
			
            //pedidos.findByCliente(fulano).forEach(System.out::println);

			List<Pedido> pedidosByCliente = pedidos.findByCliente(fulano); 

			fulano.setPedidos(new HashSet<>(pedidosByCliente));

			fulano.getPedidos().forEach(System.out::println);


			


            
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDatajpaApplication.class, args);
	}

}
