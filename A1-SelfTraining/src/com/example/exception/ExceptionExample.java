package com.example.exception;
import java.lang.*;
public class ExceptionExample {

	public static void main(String[] args) {
		CheckingAmount acc = new CheckingAmount(100);
		System.out.println("Depositing 500Rs..");
		acc.deposit(500.0);
		
		try {
			System.out.println("\n withdrawing 100 ");
			acc.withdraw(100.00);
			System.out.println("\n withdrawing 1000 ");
			acc.withdraw(1000.00);
			
		}catch(InsufficientBalanceException e) {
			System.out.println(" Insufficient amount ... need for Rs "+e.getAmount());
			//e.printStackTrace();
		}
	}
}
