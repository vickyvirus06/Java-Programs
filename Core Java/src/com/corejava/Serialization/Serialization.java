package com.corejava.Serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization {

	public static void main(String[] args) throws Exception {
		File f = new File("/home/vicky/Documents/vicky/cust.ser");
		if(!f.exists())
		{
			f.createNewFile();
		}
		
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Customer cust1 = new Customer(101,"vicky","bengaluru");
		Customer cust2 = new Customer(102,"ambi","bengaluru");
		oos.writeObject(cust1);
		oos.writeObject(cust2);
		
		fos.close();
		oos.close();
		
		System.out.println("Task Completed");
	}
}

class Customer implements Serializable
{
	int cid;
	String cname;
	String city;
	
	Customer(int cid,String cname,String city)
	{
		this.cid=cid;
		this.cname=cname;
		this.city=city;
	}
	
	@Override
	public String toString() {
	
		return "Id :  "+cid+"\nName :  "+ cname +"\nCity  :  "+city;
	}
}