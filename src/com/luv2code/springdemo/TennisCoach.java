package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	//define a default constructor
	public TennisCoach() {
		System.out.println(">>TennisCoach: inside default constructor");
	}
	
	// define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> TennisCoach: inside of doMyStartupStuff()");
	}
	
	// define my destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">> TennisCoach: inside of doMyCleanupStuff()");
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
