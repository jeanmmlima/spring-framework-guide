package com.jeanlima.springdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeanlima.springdatajpa.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido,Integer>{
    
}
