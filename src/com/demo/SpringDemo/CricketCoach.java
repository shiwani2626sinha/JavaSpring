package com.demo.SpringDemo;

public class CricketCoach implements Coach {
	
	private Fortune fortune;
	private String teamName;
	private String emailAdd;

	public void getTeamName() {
		System.out.print(teamName);
	}

	public void getEmailAdd() {
		System.out.print(emailAdd);
	}

	public void setFortune(Fortune fortune) {
		this.fortune = fortune;
	}

	
	//DI LITERAL INJECTION
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	//DI SETTER INJECTION
	public void setEmailAdd(String emailAdd) {
		this.emailAdd = emailAdd;
	}

	//using constructor injection
	//private CricketCoach(Fortune theFortune) {
	//	fortune = theFortune;
	//}
	
	@Override
	public void getDailyWorkout() {
		System.out.println("run for cricket" + teamName +" "+ emailAdd);
	}
	
	@Override
	public void getDailyFortune() {
		fortune.getFortune();
	}
	
}
