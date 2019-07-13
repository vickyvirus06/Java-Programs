package com.corejava.Object;

import java.util.Scanner;

public class MethodWithBoolean {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Yes or No ");
		String check = input.next();
		
		MethodWithBooleanTest test = new MethodWithBooleanTest();
		
		boolean flag = test.show(check);
		
		test.Display(flag);
		
		

	}

}

class MethodWithBooleanTest
{
	
	boolean show(String ch)
	{
		if(ch.equals("Yes")||(ch.equals("yes"))||(ch.equals("Yes")))
		{
			return true;
		}
		else
			return false;
	}
	
	void Display(boolean flag)
	{
		if(flag)
		{
			System.out.println("You are welcome");
		}
		else
		{
			System.out.println("bye");
		}
	}
}