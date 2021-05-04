package com.example.annotation;

import java.lang.reflect.Method;

public class AnnotationClass {

	@CustomAnnotation(value=10)
	public void sayHello() {
		System.out.println("my custom annotation");
	}
	public static void main(String[] args) throws Exception{
		AnnotationClass h =new AnnotationClass();
		Method val = h.getClass().getMethod("sayHello");
		
		CustomAnnotation ann = val.getAnnotation(CustomAnnotation.class);
		System.out.println("value is "+ann.value());
	}
}
