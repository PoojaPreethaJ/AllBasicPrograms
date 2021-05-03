package com.example.java8;

//example of java 8 feature - methods can be declared under interface using static and default
interface Phone{
	//if we dont specify anything then it is public abstract by default
	void call(); 
	default void message() {
		System.out.println("sent");
	}
	static void settings() {
		System.out.println("This is setting folder ....");
	}
}
class AndroidPhone implements Phone{
	public void call() {
		System.out.println("Calling...");
	}
}
public class DemoInterface {

	public static void main(String[] args) {
		Phone p = new AndroidPhone();
		p.call();
		p.message();
		Phone.settings();
	}
}
