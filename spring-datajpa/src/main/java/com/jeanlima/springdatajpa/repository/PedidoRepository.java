package com.jeanlima.springdatajpa.repository;

import java.util.List;

import org.aspectj.apache.bcel.generic.InstructionConstants.Clinit;
import org.springframework.data.jpa.repository.JpaRepository;

import com.jeanlima.springdatajpa.model.Cliente;
import com.jeanlima.springdatajpa.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido,Integer>{

    List<Pedido> findByCliente(Cliente cliente);
    
}
