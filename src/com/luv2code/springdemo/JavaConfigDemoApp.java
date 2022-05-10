package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

		// read spring config java class - Colocar a class com as configuracoes (SportConfig)
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get the bean from spring container - Default bean Id = Nome da Classe, mas a começar com letra minuscula
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		
		// call method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
			
		//close the context
		context.close();
		

	}

}
