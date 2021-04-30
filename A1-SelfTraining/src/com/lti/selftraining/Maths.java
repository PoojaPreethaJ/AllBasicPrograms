package com.lti.selftraining;

//The total number of students in a class are 90 out of which 45 are boys. If 50% of the total students secured grade 'A' out of which 20 are boys,
//then write a program to calculate the total number of girls getting grade 'A'.
public class Maths {

	public static void main(String[] args) {
		int total = 90;
		int boys = 45;
		int gradeA = (90/2);
		
		System.out.println("number of girls getting A grade = "+(gradeA-20));
		
	}
}
