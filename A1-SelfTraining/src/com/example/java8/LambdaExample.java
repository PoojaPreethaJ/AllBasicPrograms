package com.example.java8;

interface A{
	void show(String n);
}

/*class Demo implements A{
	public void show() {
		System.out.println("Hi");
	}
}*/
public class LambdaExample {

	public static void main(String[] args) {
		//We can create reference of interface but cannot create object of interface
		//A obj = new Demo();
		
		//instead of providing the implementation in a separte class for just 1 time we can use anonymous inner class or lambda expression
		/*A obj;
		obj = new A()
				{
					public void show() {
						System.out.println("Hello");
					}
				};*/
		
	    //using lambda : incase we have one line stmt then we can omit the curly brackets i.e obj = ()-> SOP("hello");
		A obj;
		obj = (name) ->
		{
			System.out.println("Hello "+ name);
		};
		obj.show("Pooja");
		
	}
}
