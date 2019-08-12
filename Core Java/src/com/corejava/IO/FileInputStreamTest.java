package com.corejava.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) throws Exception {
		FileInputStream input = new FileInputStream("/home/vicky/Documents/input.txt");
		int data =0;
		
		while (true) {
			
			
				
				data = input.read();
				
				System.out.print((char)data);
				if(data==-1)
					break;
				
				
				
				
	}
		
		input.close();
	}
	
	

}
