package com.example.di;

public class StudentConstructor {

	private String studentName;
	private int id;
	
	public StudentConstructor(String name) {
		this.studentName = name;
	}
	
	public StudentConstructor(String studentName, int id) {
		
		this.studentName = studentName;
		this.id = id;
	}


	public void displayStudentInfo() {
		System.out.println("Student name is : " +studentName+" and id is :"+id);
	}

}
