package com.demo.SpringDemo;

public class CricketCoach implements Coach {
	
	private Fortune fortune;
	
	private CricketCoach(Fortune theFortune) {
		fortune = theFortune;
	}
	
	@Override
	public void getDailyWorkout() {
		System.out.println("run for cricket");
	}
	
	@Override
	public void getDailyFortune() {
		fortune.getFortune();
	}
	
}
