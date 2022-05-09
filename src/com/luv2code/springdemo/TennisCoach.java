package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println(">>TennisCoach: inside default constructor");
	}

//	//Constructor Injection
//	@Autowired
//	public TennisCoach(FortuneService theFortuneService) {
//		fortuneService = theFortuneService;
//	}

	
//	//Setter Injection
//	
//	//define a default constructor
//	public TennisCoach() {
//		System.out.println(">>TennisCoach: inside default constructor");
//	}
//	
//
//	//define a setter method
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println(">>TennisCoach: inside setFortuneService() method");
//		this.fortuneService = fortuneService;
//	}
	
	
//	//Method Injection
//	
//	//define a default constructor
//	public TennisCoach() {
//		System.out.println(">>TennisCoach: inside default constructor");
//	}
//	
//
//	//define a method
//	@Autowired
//	public void doSomeCrazyStuff(FortuneService fortuneService) {
//		System.out.println(">>TennisCoach: inside doSomeCrazyStuff() method");
//		this.fortuneService = fortuneService;
//	}
	
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}




	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
