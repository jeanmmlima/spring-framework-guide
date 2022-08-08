package com.jeanlima.springmvcdemo.model;

import java.io.Serializable;

public class Estudante implements Serializable{

    private String primeiroNome;
    private String ultimoNome;
    private String curso;
    private String linguagem;

    private String[] sistemasOperacionas;


    private final String[] cursos = {
        "BTI", "EngSoft", "EngComp"
    };

    public String getPrimeiroNome() {
        return primeiroNome;
    }
    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }
    public String getUltimoNome() {
        return ultimoNome;
    }
    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }
    @Override
    public String toString() {
        return "Estudante [primeiroNome=" + primeiroNome + ", ultimoNome=" + ultimoNome + "]";
    }
    public String[] getCursos() {
        return cursos;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getLinguagem() {
        return linguagem;
    }
    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }
    public String[] getSistemasOperacionas() {
        return sistemasOperacionas;
    }
    public void setSistemasOperacionas(String[] sistemasOperacionas) {
        this.sistemasOperacionas = sistemasOperacionas;
    }

    
    

    

    

    
    
}
