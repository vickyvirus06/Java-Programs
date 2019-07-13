package com.corejava.Object;

import java.util.Scanner;

public class Digit {

	public static void main(String[] args) {
		DigitTest test = new DigitTest();
		Scanner input = new Scanner(System.in);
		char ch = input.next().charAt(0);
		boolean flag = test.isDigit(ch);
		if(flag)
		{
			System.out.println("Welcome user");
		}
		else
		{
			System.out.println("bye");
		}

	}

}

class DigitTest
{
	boolean isDigit(char ch)
	{
		if(ch>='0' || ch <='9')
		{
			return true;
		}
		else
			return false;
	}
}