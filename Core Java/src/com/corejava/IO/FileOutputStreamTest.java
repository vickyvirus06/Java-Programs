package com.corejava.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamTest {

	public static void main(String[] args) throws Exception {
		FileOutputStream output = new FileOutputStream("/home/vicky/Documents/output.txt");
		FileInputStream input = new FileInputStream("/home/vicky/Documents/input.txt");
		int data =0;
		
		
		
	/*	while (data!=-1) {
			
			
				
				data = input.read();
				char ch=(char)data;
				output.write(data);
				System.out.print(ch);
				
				
				
	}*/
		
		input.close();
		output.close();

	}

}
