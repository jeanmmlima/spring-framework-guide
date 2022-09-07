package com.jeanlima.springdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeanlima.springdatajpa.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto,Integer>{
    
}
