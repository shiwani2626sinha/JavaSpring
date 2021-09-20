package com.demo.SpringDemo;

public class HappyFortune implements Fortune {
	
	@Override
	public void getFortune() {
		System.out.print("happy fortune");
	}
}
