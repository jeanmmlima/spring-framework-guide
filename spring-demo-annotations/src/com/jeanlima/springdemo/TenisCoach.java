package com.jeanlima.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

//adicionar a anotação para transformar a classe em bean quando o context escaneá-la
//@Component para escaner e o parametro é o bean ID
@Component
public class TenisCoach implements Coach {
	
	/*
	 * ###### PARTE 4 - Field Injection
	 * Injeção de dependencia via atributo/campo
	 *  Nesse exemplo, Spring vai buscar por um componente que implemente
	 * a interface PrevisaoDiaria! No nosso exemplo, o componente é SortePrevisaoDiaria
	 * Preencheno o valor de previsaoDiaria
	 * 
	 * Usa uma tecnologia Java chamadno - Java Reflection
	 * 
	 * Caso haja mais de um compoente que implemente a interface PrevisaoDiaria:
	 * SortePrivisaoDiaria ClimaPrevisaoDiaria DOlarPreivisaoDiaria
	 * é preciso especificar QUAL componente será usado para injetar a dependencia
	 * Isso é feito com a anotação @Qualifier
	 */
	
	@Autowired
	@Qualifier("randomPrevisaoDiaria")
	private PrevisaoDiaria previsaoDiaria;
	
	public TenisCoach() {
		System.out.println(">> TenisCoach: dentro do construtor");
	}
	
	//#### PARTE 5 - init e destroy métodos
	@PostConstruct
	public void doStartupStaff() {
		System.out.println(">> TenisCoach: dentro do método startup");
	}
	
	/**
	 * Here is a subtle point you need to be aware of with "prototype" scoped beans. 
	 * For "prototype" scoped beans, Spring does not call the @PreDestroy method
	 * In contrast to the other scopes, Spring does not manage the complete lifecycle of a prototype bean: the container instantiates, configures, and otherwise assembles a prototype object, and hands it to the client, with no further record of that prototype
instance.  Thus, although initialization lifecycle callback methods are called on all objects regardless of scope, in the case of prototypes, configured destruction lifecycle callbacks are not called. The client code must clean up prototype-scoped objects and release expensive resources that the prototype bean(s) are holding. 
To get the Spring container to release resources held by prototype-scoped beans, try using a custom bean post-processor, which holds a reference to beans that need to be cleaned up.
	 */
	
	@PreDestroy
	public void doCleanupStaff() {
		System.out.println(">> TenisCoach: dentro do método cleanup");
	}
	
	/* ###### PARTE 1
	 *  Injeção de Dependencia VIA CONSTRUTOR
	 * Nesse exemplo, Spring vai buscar por um componente que implemente
	 * a interface PrevisaoDiaria!
	 * No nosso exemplo, o componente é SortePrevisaoDiaria
	 * 
	 * Caso haja mais de um compoente que implemente a interface PrevisaoDiaria:
	 * SortePrivisaoDiaria ClimaPrevisaoDiaria DOlarPreivisaoDiaria
	 * é preciso especificar QUAL componente será usado para injetar a dependencia
	 * Isso é feito com a anotação @Qualifier
	 *   @Autowired
    public TennisCoach(@Qualifier("randomFortuneService") FortuneService theFortuneService) {}
	 
	
	@Autowired //injeção de dependencia via construtor
	public TenisCoach(PrevisaoDiaria previsaoDiaria) {
		this.previsaoDiaria = previsaoDiaria;
	}
	*/
	
	/*
	 * ##### PARTE 2
	 * Injeção de dependencia VIA SETTER
	 * Nesse exemplo, Spring vai buscar por um componente que implemente a
	 * interface PrevisaoDiaria e "CONECTAR/LIGAR" a dependencia (previsaoDiaria)
	 * ao Componente Encontrado via método setter!
	 * 
	
	
	public TenisCoach() {
		System.out.println(">> TenisCoach: dentro do construtor");
	}
	
	@Autowired
	public void setPrevisaoDiaria(PrevisaoDiaria previsaoDiaria) {
		this.previsaoDiaria = previsaoDiaria;
		System.out.println(">> TenisCoach: dentro do set fazendo a injeção de dep");
	}
	*/
	
	/*
	 * ###### PARTE 3 - Injeção de Dependencia Via QUALQUER método (além do setter)
	 * 
	 
	
	public TenisCoach() {
		System.out.println(">> TenisCoach: dentro do construtor");
	}
	
	@Autowired
	public void qualquerMetodoFaz(PrevisaoDiaria previsaoDiaria) {
		this.previsaoDiaria = previsaoDiaria;
		System.out.println(">> TenisCoach: dentro de método aleatório fazendo a injeção de dep");
	}
	*/

	@Override
	public String getTreinoDiario() {
		return "Pratique seu saque!";
	}

	@Override
	public String getPrevisaoDiaria() {
		return previsaoDiaria.getPrevisao();
	}
	

}
