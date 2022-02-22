package com.jeanlima.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from spring container
		Coach theCoach = context.getBean("tenisCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("tenisCoach",Coach.class);
		
		//são iguais se ocupam o mesmo espaço na memória
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("\n Apontam para o mesmo objeto: "+ result);
		System.out.println("\n Local na memória: "+ theCoach);
		System.out.println("\n Local na memória: "+ alphaCoach);
		
		context.close();

	}

}
