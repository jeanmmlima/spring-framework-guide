package com.jeanlima.springdatajpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeanlima.springdatajpa.model.Cliente;

//classe e tipo do id
//start jpa já escaneia interfaces que herdam o JpaRepository - não precisa da anotaçao
public interface ClienteRepository extends JpaRepository<Cliente,Integer>{

    List<Cliente> findByNomeLike(String nome);

    

    /*
     * Já tem um entity manager encapsulado que vai fazer as operações de transação!
     */
    
}
