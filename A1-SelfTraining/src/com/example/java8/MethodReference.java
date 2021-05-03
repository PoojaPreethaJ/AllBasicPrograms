package com.example.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//call by method
//why interface --> to change the implementation to whatever you want 
interface Parser{
	String parse(String str);
}

class StringParser{
	public static String convert(String s) {
		s= s.toUpperCase();
		return s;
	}
}
class MyPrinter{
	public void print(String str,Parser p) {
		str = p.parse(str);
		System.out.println(str);
	}
}
public class MethodReference {

	public static void main(String[] args) {
		
		StringParser sp = new StringParser(); 
		MyPrinter mp = new MyPrinter();
		String str = "Pooja Preetha J";
		mp.print(str,new Parser() {
			public String parse(String s) {
				return StringParser.convert(s);
			}
		});
		
		//above code using method reference
		mp.print(str, StringParser::convert);
	
		
//		List<String> names = Arrays.asList("Pooja","Preetha","Priya","Shilpa");
//		/*Consumer<String > con = new Consumer<String>() {
//			//accept method takes the value one by one
//			public void accept(String s) {
//				System.out.println(s);
//			}
//		};*/
//		
//		//OR
//		//names.forEach(s->System.out.println(s));
//		
//		//instead of using a lambda expression , we are using method reference
//		names.forEach(System.out::println);//passing method as a parameter
	
	}
}
