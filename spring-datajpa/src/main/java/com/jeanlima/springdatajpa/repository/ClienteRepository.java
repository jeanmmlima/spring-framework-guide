package com.jeanlima.springdatajpa.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jeanlima.springdatajpa.model.Cliente;

@Repository
public class ClienteRepository {

    @Autowired
    private EntityManager entityManager;


    //preciso anotar com transactional para dizer que vai fazer uma transação com o banco (commit and finish)
    @Transactional
    public Cliente salvar(Cliente cliente){
        entityManager.persist(cliente);
        return cliente;
    }

    @Transactional
    public Cliente atualizar(Cliente cliente){
        entityManager.merge(cliente);
        return cliente;
    }

    @Transactional
    public void deletar(Cliente cliente){
        if(!entityManager.contains(cliente)){
            cliente = entityManager.merge(cliente);
        }
        entityManager.remove(cliente);
    }

    @Transactional
    public void deletaById(Integer id){
        Cliente cliente = entityManager.find(Cliente.class, id);
        deletar(cliente);
    }


    @Transactional(readOnly = true)
    public List<Cliente> buscarPorNome(String nome){
        //:nome serve para definir o parametro jpa
        String jpql = " select c from Cliente c where c.nome like :nome";
        TypedQuery<Cliente> query = entityManager.createQuery(jpql,Cliente.class);
        query.setParameter("nome", "%"+nome+"%");
        return query.getResultList();
    }

    @Transactional(readOnly = true)
    public List<Cliente> obterTodos(){
        return entityManager
        .createQuery("from Cliente",Cliente.class)
        .getResultList();
        
    }
    
}
