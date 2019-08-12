package com.corejava.IO;

import java.io.File;
import java.io.IOException;

public class FileOperation {
	
	public static void main(String[] args) throws Exception {
		File f1 = new File("/home/vicky/Documents/vickypoojari.txt");
		System.out.println(f1.exists());
		if(!f1.exists())
		{
			f1.createNewFile();
		}
		
		System.out.println(f1.isHidden());
		System.out.println(f1.getAbsolutePath());
		f1.delete();
		
		File f2 = new File("/home/vicky/Documents/vicky");
		f2.mkdir();
		
		File f3 = new File(f2, "my.txt");
		
		f3.createNewFile();
	}

}
