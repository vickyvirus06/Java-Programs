package com.corejava.IO;

import java.io.File;
import java.io.PrintWriter;

public class PrintWriterTest {

	public static void main(String[] args) throws Exception{
		File file = new File("/home/vicky/Documents/vicky.txt");
		file.createNewFile();
		PrintWriter pw = new PrintWriter(file);
		
		pw.print("Hello " );
		pw.print("\t Vicky");
		pw.write("Java Programming Language ");
		pw.print("\n PrintWriter");
		pw.println("Bye");
		
		System.out.println("Completed");
		pw.close();
	}

}
