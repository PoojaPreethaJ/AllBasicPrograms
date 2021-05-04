package com.example.collections;

import java.util.Scanner;
import java.util.Stack;

//matching parenthesis or not
public class StackExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int i,out=0;
		Stack<Character> stack = new Stack<Character>();
		
		for( i=0;i<str.length();i++) {
			if(str.charAt(i)=='{' || str.charAt(i)=='(' || str.charAt(i)=='[' ) {
				stack.push(str.charAt(i));
				continue;
			}
			else if((!stack.isEmpty()) && str.charAt(i)=='}' && stack.peek()=='{') {
				stack.pop();
			}
			else if((!stack.isEmpty()) && str.charAt(i)==']' && stack.peek()=='[') {
				stack.pop();
			}
			else if((!stack.isEmpty()) && str.charAt(i)==')' && stack.peek()=='(') {
				stack.pop();
			}
			else
				out++;
		}
			if(stack.empty() && out==0) {
				System.out.println("matched parenthesis");
			}
			else
				System.out.println("uneven parenthesis");
		}
	}

