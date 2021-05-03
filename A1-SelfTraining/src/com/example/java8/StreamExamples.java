package com.example.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//examples on filter,map,collect
public class StreamExamples {

	public static void main(String[] args) {
		List<String> numbers = Arrays.asList("1","2","3","4","5","6","7");
		List<Integer> even = numbers.stream().map(s->Integer.valueOf(s)).filter(num -> num % 2==0).collect(Collectors.toList());
		

		System.out.println(even);
	}

}
