package com.example.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.*;

public class ArrayListExample {

	public static <T,U> List<U> convert(List<T>list,Function<T,U> func){
		return list.stream().map(func).collect(Collectors.toList());
	}
	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		for(int i=1;i<= 5;i++) {
			ar.add(i);
		}
		List<String> arr = Arrays.asList("1","2","6","7","8","9");
		List<Integer> list = convert(arr,Integer::parseInt);
		ar.addAll(list);
		System.out.println("After changing and appending the values to integer list"+list);
		System.out.println("before deletion :"+ar);
		ar.remove(2);
		System.out.println("after deletion :"+ar);
		if(ar.contains(5)) System.out.println("the list contains element 5");
	}
}
