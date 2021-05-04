package com.example.files;
import java.io.*;

public class Streams {

	public static void main(String[] args) throws IOException {
		
			FileInputStream inp = new FileInputStream("G:/LTI_A1_MYTRAINING/AllBasicPrograms/A1-SelfTraining/src/com/example/files/input2.txt");
			System.out.println("File contains -> ");
			
			//read() read character by character
			/*int i ;
			while((i = inp.read()) != -1) {
				System.out.print((char)i);
				
			}
			inp.close();*/
		
			//read(Byte[]) ,read(Byte[],int offset,int length)  -> read data into a byte array
			
			byte[] data = new byte[1024];
			char c;
			try {
				inp.read(data);
				for(byte b: data) {
					c= (char)b;
					System.out.print(c);
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			finally {
				inp.close();
			}
			
	}
}
