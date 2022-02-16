package com.jeanlima.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {

		// load the spring config. file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

		// recuperar bean do spring container
		Coach meuCoach = context.getBean("meuCoach", Coach.class);
		
		Coach outroCoach = context.getBean("meuCoach", Coach.class);
		
		//checar se são os mesmos beans
		boolean result = (meuCoach == outroCoach);
		
		System.out.println("\nApontando para o mesmo objeto: "+result);
		System.out.println("\nLocal na memória de meuCoach: "+ meuCoach);
		System.out.println("\nLocal na memória de meuCoach: "+ outroCoach + "\n");
		
		
		
		context.close();

	}

}
