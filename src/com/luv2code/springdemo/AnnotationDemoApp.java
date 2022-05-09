package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//get the bean from spring container - Default bean Id = Nome da Classe, mas a começar com letra minuscula
		Coach theCoach =context.getBean("tennisCoach", Coach.class);
		
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		
		// call method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		
		//close the context
		context.close();
		

	}

}
