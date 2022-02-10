package com.jeanlima.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		//load the spring config. file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//recuperar bean do spring container
		Coach meuCoach = context.getBean("meuCoach",Coach.class);
		
		//chamar metodos do bea
		System.out.println(meuCoach.getTreinoDiario());
		
		//chamar sorte do dia
		System.out.println(meuCoach.getSorteDiaria());
		
		//fechar contexto
		context.close();

	}

}
