package com.demo.SpringDemo;

import java.util.Random;

public class RandomFortune implements Fortune {

	String[] fortuneArray = {"one", "two", "three"};
	@Override
	public void getFortune() {
		
		Random r=new Random();        
      	int randomNumber=r.nextInt(fortuneArray.length);
      	System.out.println(fortuneArray[randomNumber]);
	}

}
