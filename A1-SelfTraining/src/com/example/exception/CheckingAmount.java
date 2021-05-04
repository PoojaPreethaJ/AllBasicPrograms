package com.example.exception;
import java.io.*;

public class CheckingAmount {

	private double balance;
	private int number;
	
	public CheckingAmount(int number) {
		this.number = number;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) throws InsufficientBalanceException {
		if(amount <= balance) {
			balance -= amount ;
		}else {
			double needs = amount - balance;
			throw new InsufficientBalanceException(needs);
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public int getNumber() {
		return number;
	}
}
