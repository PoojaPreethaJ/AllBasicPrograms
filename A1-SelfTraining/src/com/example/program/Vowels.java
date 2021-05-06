package com.example.program;

import java.util.Scanner;

public class Vowels {

	public static int prime(int e) {
		int sum = 0;
		int num = 0;
		for(int i=1;i<= e;i++) {
			int counter =0;
			for(num= i;num>=1;num--) {
				if(i%num ==0) {
					counter = counter +1;
				}
			}
			if(counter == 2) {
				sum =sum+i;
			}
		}
		return sum;
	}
	public static int changeToNumber(int i) {
		int val = i*100;
		int temp = prime(val);
		return temp;
	}
	private static int sumOfNumbers(int tot) {
		Integer num = tot;
		String s = num.toString();
		int sum=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=0) {
				String st = Character.toString(s.charAt(i));
				sum += Integer.parseInt(st);
			}
			
		}
		if(sum>=10) {
			sum = sumOfNumbers(sum);
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int sep=0;
		char c[] = new char[s.length()]; 
		int tot=0;
		String ns = s.toLowerCase();
		for(int i=0;i<s.length();i++) {
			if(ns.charAt(i)=='a'||ns.charAt(i)=='e'||ns.charAt(i)=='i'||ns.charAt(i)=='o'||ns.charAt(i)=='u') {
				tot = changeToNumber(i);
				sep = sumOfNumbers(tot);
				System.out.print(sep);
			}
			else {
				System.out.print(ns.charAt(i));
			}
		}
		
	}
	
}
