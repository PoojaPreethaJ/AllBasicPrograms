package com.example.files;
import java.io.*;

public class CharacterExample  {

	public static void main(String[] args) throws IOException {
		FileReader in = null;
		FileWriter out = null;
		
		try {
			in = new FileReader("G:/LTI_A1_MYTRAINING/AllBasicPrograms/A1-SelfTraining/src/com/example/files/input1.txt");
			out = new FileWriter("output1.txt");
			
			int c=0;
			while((c= in.read()) != -1) {
				out.write(c);
			}
			System.out.println("contents are copied successfully ");
		}
		finally {
			in.close();
			out.close();
		}
	}
}
