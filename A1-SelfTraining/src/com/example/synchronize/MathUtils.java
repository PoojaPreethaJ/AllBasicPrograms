package com.example.synchronize;

public class MathUtils {

	synchronized void getMultiples(int n) { //avoids multiple threads to access this method at same time
		
		
		//synchronized(this) {//to lock certain blocks of code i.e accessible to one thread at a time
		for(int i=1;i<=5;i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);//after each multiplication the thread would sleep for 400ms i.e pause the execution for 400
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		}
	//}
	
}
