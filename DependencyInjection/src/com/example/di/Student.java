package com.example.di;

public class Student {

	private String studentName;
	private int id;
	Fees fee;
	
	
	public void setFee(Fees fee) {
		this.fee = fee;
	}

	public void checkPaid() {
		System.out.println("Student name is : " +studentName+" and id : "+id );
		fee.paid();
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void displayStudentInfo() {
		System.out.println("Student name is : " +studentName);
	}
}
