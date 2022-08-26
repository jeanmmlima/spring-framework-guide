package com.jeanlima.springbootexample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
 * Criar a classe de configuração de acordo com o objetivo: ConfigurtionDB, ConfiguratioSecurity...
 */
/*
 * Anotando a classe com @Configuration
 * você diz pro container Spring que essa é uma classe de configuração
 * 
 * As configuraçãoes são feitas através de BEANS
 */
@Configuration
public class MinhaConfiguration {

    /*
     * @Bean
     * informa que ele deve criar um objeto no CONTEXTO da aplicação
     * assim, onde vc precisar, voce pode usar essa configuração
     * 
     * poderia ser a configuração do banco, config de segurança...
     */
    @Bean(name = "applicationName")
    public String applicationName(){
        return "Sistema exemplo";
    }
    
}
