package com.example.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		/*Student stud = context.getBean("student",Student.class);
		stud.displayStudentInfo();
		System.out.println("Register number : "+stud.getId());
		
		StudentConstructor studcon = context.getBean("studcon",StudentConstructor.class);
		studcon.displayStudentInfo();
		
		StudentConstructor justname = context.getBean("studsinglecon",StudentConstructor.class);
		justname.displayStudentInfo();*/
		
		/*Student studobj = new Student();
		Fees f = new Fees();
		studobj.setFee(f);
		studobj.checkPaid();*/
		
		//above tightly coupled block can be changed to below code
		Student stu = context.getBean("student",Student.class);
		stu.checkPaid();
		
		
		
	}
}
