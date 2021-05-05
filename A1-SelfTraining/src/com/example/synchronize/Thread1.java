package com.example.synchronize;

public class Thread1 extends Thread{

	MathUtils mu;
	public Thread1(MathUtils mu) {
		this.mu = mu;
	}
	public void run() {
		try {
			mu.getMultiples(3);
		}catch(Exception e) {
			System.out.println("Exception is caught ...");
		}
	}
}
