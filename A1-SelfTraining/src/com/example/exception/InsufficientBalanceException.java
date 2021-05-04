package com.example.exception;
import java.io.*;

public class InsufficientBalanceException extends Exception{

	private double amount ;

	public InsufficientBalanceException(double amount) {
		this.amount = amount;
	}
	public double getAmount() {
		return amount;
	}
	
}
