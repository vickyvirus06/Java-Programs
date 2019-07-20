package com.corejava.String;

public class UpperCaseAndLowerCase {

	public static void main(String[] args) {
		String fname = "vicky";
		String lname = "poojari";
		
		String fullname = fname+lname;
		
		System.out.println("---Uppercase");
		System.out.println(fname.toUpperCase()+" " + lname.toUpperCase());
		
		System.out.println("\n\n");
		for(int i=fullname.length()-1;i>=0;i--)
		{
			String temp= fullname.charAt(i)+" ";
			if(i%2==0)
			{
				System.out.print(temp.toUpperCase());
			}
			else
			{
				System.out.print(temp.toLowerCase());
			}
		}

	}

}
