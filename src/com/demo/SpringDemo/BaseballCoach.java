package com.demo.SpringDemo;

public class BaseballCoach implements Coach {
	
	Fortune fortune;
	
	public void setFortune(Fortune fortune) {
		this.fortune = fortune;
	}


	@Override
	public void getDailyWorkout() {
		System.out.println("baseball 20 mins");
	}

	@Override
	public void getDailyFortune() {
		fortune.getFortune();
	}
}
