package com.jeanlima.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {

		// load the spring config. file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");

		// recuperar bean do spring container
		CrossfitCoach meuCoach = context.getBean("meuCrossfitCoach", CrossfitCoach.class);

		// chamar metodos do bea
		System.out.println(meuCoach.getTreinoDiario());

		// chamar sorte do dia
		System.out.println(meuCoach.getSorteDiaria());
		
		System.out.println(meuCoach.getEmail());
		
		// fechar contexto
		context.close();

	}

}
