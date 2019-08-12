package com.corejava.IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class StudentDetailsFileOutput {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("/home/vicky/Documents/Student Details.txt");
		StudentDetails student = new StudentDetails(fos);
		System.out.println("Enter Student Details  ");
		boolean flag=false;;
		while(!flag)
		{
			System.out.print("\nEnter Name   :      ");
			String name = student.next();
			System.out.print("\nEnter Mobile Number   :      ");
			String mobile_no = student.next();
			System.out.print("\nEnter Programming Language   :      ");
			String programming = student.next();
			student.addDetails(name,mobile_no,programming);
			System.out.print("\nYou Want to Enter more details 'Y' for yes and 'N' for no  :  ");
			String choice = student.next();
			if(choice.equalsIgnoreCase("y"))
			{
				
			}
			else
			{
				flag=true;
			}
			
		}
		
		System.out.println("\nThanks for Using this Application ");
		
		student.fos.close();
	}

}

class StudentDetails
{
	FileOutputStream fos;
	String const_name = "Name  :  ";
	String const_mobile_no = "Mobile No  : ";
	String const_programming = "Programming Language   :  ";
	
	StudentDetails(FileOutputStream fos)
	{
		this.fos=fos;
	}
String next() throws IOException
{
	
	StringBuffer val=new StringBuffer();
	
	while (true) {
		int data = System.in.read();
		if(data==13)
		{
			
		}
		else if(data==10)
		{
			break;
		}
		
		else
		{
		
		
			char ch=(char)data;
			val.append(ch);
			
		}
		
	}
	return val.toString();
}

void addDetails(String name,String mobile_no,String programming) throws IOException
{
	for (int i = 0; i < const_name.length(); i++) {
		char ch = const_name.charAt(i);
		int data= (int)ch;
		fos.write(data);
	}
	
	for (int i = 0; i < name.length(); i++) {
		char ch = name.charAt(i);
		int data= (int)ch;
		fos.write(data);
		if(i==name.length())
		fos.write((char)13);
	}
	
	for (int i = 0; i < const_mobile_no.length(); i++) {
		char ch = const_mobile_no.charAt(i);
		int data= (int)ch;
		fos.write(data);
	}
	
	for (int i = 0; i < mobile_no.length(); i++) {
		char ch = mobile_no.charAt(i);
		int data= (int)ch;
		fos.write(data);
		if(i==name.length())
		fos.write((char)13);
	}
	
	for (int i = 0; i < const_programming.length(); i++) {
		char ch = const_programming.charAt(i);
		int data= (int)ch;
		fos.write(data);
	}
	
	for (int i = 0; i < programming.length(); i++) {
		char ch = programming.charAt(i);
		int data= (int)ch;
		fos.write(data);
		if(i==name.length())
		fos.write((char)13);
	}
	
	fos.write((char)13);
}
}