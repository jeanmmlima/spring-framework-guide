package com.jeanlima.springdatajpa.model;

import java.math.BigDecimal;
import java.util.Date;

public class Pedido {

    private Integer id;
    private Cliente cliente;
    private Date dataPedido;
    private BigDecimal total;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Date getDataPedido() {
        return dataPedido;
    }
    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }
    public BigDecimal getTotal() {
        return total;
    }
    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    
    
}
