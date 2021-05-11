package com.example.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		
		Airtel airtel = new Airtel();
		airtel.calling();
		airtel.data();
		
		//benefit of using interface reference is that instead of creating and calling the methods of a perticular class again and again we can use interface as a reference 
		/*Sim sim = new Airtel();
		sim.calling();
		sim.data();*/
		
		//to make this configurable -> use spring framework
		/*ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Airtel air = (Airtel) context.getBean("airtel");
		air.calling();*/
		
		//instead of type casting it we can use the below method to reduce the steps
		//context.getBean("idea",Idea.class);
		
		//to make it more generic by giving reference of Sim
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Sim sim =  context.getBean("airtel",Sim.class);
		sim.calling();
		sim.data();
	}
}
