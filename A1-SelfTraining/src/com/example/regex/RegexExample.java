package com.example.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile(".xp.*"); //regular expression
		Matcher matcher = pattern.matcher("expression"); //give the line to be checked for pattern
		System.out.println("String matches the given regex - "+ matcher.matches());
		
		//Check if the given stmt has the required pattern
		System.out.println(Pattern.matches("[xyz]", "wbcd"));
		System.out.println(Pattern.matches("[^xyz]", "p"));
		System.out.println(Pattern.matches("[xyz]", "x"));
		System.out.println(Pattern.matches(".*s$", "mangoes"));
		
		//regex quantifiers ?,+,{n}->occurs n times,{y,z}->occurs y times but less than z times
		System.out.println("Regex Quantifiers ....");
		System.out.println(Pattern.matches("[xyz]?", ""));
		System.out.println(Pattern.matches("[xyz]+", "yyy"));
		System.out.println(Pattern.matches("[xyz]{3}", "zzzz"));
		System.out.println(Pattern.matches("[xyz]{3,5}", "zzzz"));
		
		//regex matacharacters
		System.out.println("Regex Metacharacter");
		System.out.println(Pattern.matches("d", "abc5"));
		System.out.println(Pattern.matches("\\d", "4"));
		System.out.println(Pattern.matches("\\d\\d", "44"));
		System.out.println(Pattern.matches("\\D", "44"));
		System.out.println(Pattern.matches("\\d*", "444"));
		
		
		
		//how to verify email validation
		try(Scanner sc = new Scanner(System.in)){
			while(true) {
				System.out.println("Enter the regex pattern :");
				String regex = sc.nextLine();
				Pattern newPattern = Pattern.compile(regex);
				Matcher newMatcher = newPattern.matcher("This is a new line . ");
				boolean present = false;
				while(newMatcher.find()) {
					System.out.println("text found "+newMatcher.group()+"starting at index "+newMatcher.start()+ " and ending at index "+newMatcher.end());
					present =true;
				}
				if(!present) {
					System.out.println("Match not found.");
				}
				
			}
		}
		
		
		
	}
}
