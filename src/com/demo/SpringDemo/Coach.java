package com.demo.SpringDemo;

public interface Coach {
	public default void getDailyWorkout() {
		System.out.println("general");
	}
	
	public default void getDailyFortune() {
		System.out.print("general fortune");
	}
}
