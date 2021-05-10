package com.example.ioc;

public class Airtel implements Sim{

	@Override
	public void calling() {
		System.out.println("calling serice provided by Bharatiya Airtel !! ");
	}
	
	@Override
	public void data() {
		System.out.println("data serice provided by Bharatiya Airtel !! ");
	}
}
