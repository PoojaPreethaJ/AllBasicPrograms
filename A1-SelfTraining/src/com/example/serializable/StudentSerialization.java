package com.example.serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Student implements Serializable{
	public static final long serialVersionUID = 1L ;//1L -> long type variable ..can have your own value //to uniquely identify your object once it is serialized also keeps a version of it .
	
	private String name;
	private int age;
	private String address;
	public Student(String name, int age, String address) {
		
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	//to print the object in a readable manner
	@Override
	public String toString() {
		return ("String name is "+this.getName()+" ,age is: "+this.getAge()+" and address is : "+this.getAddress());
		
	}
}

public class StudentSerialization  {
	public static void main(String[] args) {
		Student s = new Student("Pooja",23,"Basavanagar");
		FileOutputStream out = null;
		ObjectOutputStream obj = null;
		
		try {
			out = new FileOutputStream("G:/LTI_A1_MYTRAINING/AllBasicPrograms/A1-SelfTraining/src/com/example/files/input.txt");
			obj = new ObjectOutputStream(out);
			obj.writeObject(s);
			
			obj.close();
			out.close();
			
			System.out.println("object has been serialized: \n"+ s);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
