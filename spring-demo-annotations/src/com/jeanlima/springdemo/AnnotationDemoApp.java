package com.jeanlima.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//read spring config file
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from spring container
		Coach theCoach = context.getBean("tenisCoach",Coach.class);
		
		System.out.println(theCoach.getTreinoDiario());
		System.out.println(theCoach.getPrevisaoDiaria());
		
		//close container
		context.close();

	}

}
