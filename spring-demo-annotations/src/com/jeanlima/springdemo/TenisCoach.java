package com.jeanlima.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

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
