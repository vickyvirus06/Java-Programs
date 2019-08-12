package com.corejava.IO;

import java.io.IOException;

public class CustomInputStream {

	public static void main(String[] args) throws IOException {
		
		
		MyReader read = new MyReader();
		System.out.println("Enter your Name   : ");
		String name = read.readLine();
		System.out.println("Enter your Email Id  :   ");
		String emailid = read.readLine();
		System.out.println("Hello "+name+ " Your email id is "+emailid);
		
		System.out.println("Enter mobile No :   ");
		String nm = read.readLine();
		long mobile_no=Long.parseLong(nm);
		
		System.out.print("Enter b :   ");
		int a=Integer.parseInt(read.readLine());
		
		System.out.print("Enter b :   ");
		int b=Integer.parseInt(read.readLine());
		
		System.out.printf("Sum of a and b is %d",a+b);
		
	}

}

class MyReader
{
	
	String readLine() throws IOException
	{
		
		StringBuffer val = new StringBuffer();
		
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
}