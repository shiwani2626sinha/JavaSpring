package com.demo.SpringDemo;

public class TrackCoach implements Coach{
	
	
	
	
	private Fortune fortune;

	@Override
	public void getDailyWorkout() {
		System.out.println("run on track");
		fortune.getFortune();
	}

	public void setFortune(Fortune fortune) {
		this.fortune = fortune;
	}
    
	

}
