package com.corejava.Object;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		RegistrationTest test = new RegistrationTest();
		
		test.data(input);
		System.out.println("\n--------------------------");
		System.out.println("Exits");
	}
}

class RegistrationTest
{
	void data(Scanner input)
	{
		String name = null;
		String city=null;
		int age=0;
		System.out.println("Enter Y for Enter Details and N for Exit   ");
		char choice = input.next().charAt(0);
		if(choice=='N'|| choice == 'n')
		{
			return;
		}
		else
		{
			System.out.print("Enter Your Name :  ");
			 name = input.next();
			System.out.print("Enter Your City Name :  ");
			 city = input.next();
			System.out.print("Enter Your Age :  ");
			 age = input.nextInt();
			
			
		}
		System.out.println("You want to Print Your details   ");
		String choice1 = input.next();
		
		if(choice1.toLowerCase().equals("yes"))
		{
			display(name,city,age);
		}
		else
		{
			System.out.println("Thanks "+ name + " for registering");
		}
	}
	
	void display(String name,String city,int age)
	{
		System.out.println();
		System.out.println("Name :   "+ name);
		System.out.println("City :   "+ city);
		System.out.println("Age :   "+ age);
	}
}