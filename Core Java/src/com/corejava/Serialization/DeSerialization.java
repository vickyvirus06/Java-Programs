package com.corejava.Serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class DeSerialization {
	
	public static void main(String[] args) throws Exception {
		File f = new File("/home/vicky/Documents/vicky/cust.ser");
		
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Customer cust = (Customer)ois.readObject();
		System.out.println(cust);
		try {
		while (cust!=null) {
			Customer cust1=(Customer)ois.readObject();
			System.out.println(cust1);
		}
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		fis.close();
		ois.close();
		
	}
	
	
	
}

