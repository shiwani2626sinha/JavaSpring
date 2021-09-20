package com.demo.SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		// load the application context
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//retrive bean
		//id and provide the interface on which spring class depends
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//use bean.function
		theCoach.getDailyWorkout();
		theCoach.getDailyFortune();
		
		
		//close the application context
		context.close();
	}

}
