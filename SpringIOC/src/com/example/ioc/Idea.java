package com.example.ioc;

public class Idea implements Sim{

	@Override
	public void calling() {
		System.out.println("calling serice provided by Idea !! ");
	}
	
	@Override
	public void data() {
		System.out.println("data serice provided by Idea !! ");
	}
}
