package com.example.files;
import java.io.*;

public class ByteExample {

	public static void main(String[] args) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream("G:/LTI_A1_MYTRAINING/AllBasicPrograms/A1-SelfTraining/src/com/example/files/input.txt");
			out = new FileOutputStream("output.txt");
			
			int c ;
			while((c=in.read()) != -1) {
				out.write(c);
			}
				
		}
		catch(Exception e) {
			System.out.println("File not found ...");
		}
		finally {
			if(in != null) {
				in.close();
			}
			if(out != null) {
				out.close();
			}
		}
	}
}
