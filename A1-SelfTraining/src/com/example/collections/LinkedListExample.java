package com.example.collections;
import java.util.*;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		for(int i=1;i<=5;i++) {
			ll.add(i);
		}
		
		System.out.println(ll);
	
		ll.remove(3);
		System.out.println("After removing the element "+ll);
	}
}
