package com.jeanlima.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		//read JAVA spring config file
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(EsporteConfig.class);
		
		//get the bean from spring container
		Coach theCoach = context.getBean("tenisCoach",Coach.class);
		
		System.out.println(theCoach.getTreinoDiario());
		System.out.println(theCoach.getPrevisaoDiaria());
		
		//close container
		context.close();

	}

}
