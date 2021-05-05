package com.example.boxing;

public class AutoBoxingExample {

	public static void main(String[] args) {
		int i=10;
		
		//Autobox
		Integer obj = Integer.valueOf(10);
		System.out.println("value of integer object "+obj+" type of obj after autoboxing "+obj.getClass().getName());
		
		//Auto-unboxing
		//char x = 'a';
		//Character charObj = Character.valueOf(x);
		//or
		int prim = obj;
		System.out.println("value of primitive data "+prim);
		
		
		//Autoboxing of character
		Character charObj = 'a';
		
		//auto unboxing for character
		char c = charObj;
		System.out.println("values of ch: "+ c);
		System.out.println("values of charObj: "+charObj);
		
	}
}
