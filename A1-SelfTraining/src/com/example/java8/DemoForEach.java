package com.example.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoForEach {

	public static void main(String[] args) {
		/*List<String> myList = ArrayList<String>();
		myList.add("Pooja");
		myList.add("Preetha");
		myList.add("Priya");
		myList.add("Shilpa");*/
		
		//OR
		
		List<String> myList = Arrays.asList("Pooja","Preetha","Priya","Shilpa");
		//external loop
		/*for(String names : myList) {
			System.out.println(names);
		}*/
		
		//internal loop - JAVA 8
		myList.forEach(names -> System.out.println(names));//names -> System.out.println(names) this is lambda expression
		
	}
}
