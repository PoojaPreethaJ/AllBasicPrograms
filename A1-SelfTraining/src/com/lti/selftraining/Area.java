package com.lti.selftraining;

import java.util.Scanner;

//Examples on Operators
//finding the area and perimeter of a rectangle
public class Area {

	public static double area(double len ,double width) {
		return len * width;
	}
	public static double perimeter(double len ,double width) {
		return 2*(len+width);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length and width of a rectangle ");
		double len = sc.nextDouble();
		double width = sc.nextDouble();
		
		System.out.println(area(len,width)+"\n");
		System.out.println(perimeter(len,width));
		sc.close();
	}
}
