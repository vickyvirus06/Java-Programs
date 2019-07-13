package com.corejava.Method;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		
		CalculatorDemo test = new CalculatorDemo();
		System.out.print("\nEnter your first Number :  ");
		int first = input.nextInt();
		System.out.print("\nEnter your Second Number  :  ");
		int second = input.nextInt();
		
		
		test.sum(first,second);
		
		
		System.out.print("How Many Numbers You want to add   :    ");
		int number = input.nextInt();
		
		int[] answers = new int[number];
		for(int i =0;i<number;i++)
		{
			System.out.print("Enter your " + (i+1) +" Number  :   ");
			answers[i]= input.nextInt();
		}
		
		
		int result = test.sum(answers);
		System.out.println("Total value is  :  " + result);
		

	}

}

class CalculatorDemo
{
	
	void sum(int x,int y)
	{
		System.out.println("Sum : " +(x+y));
	}
	
	
	void sum(int x,int y, int z)
	{
		System.out.println("Sum : "+(x+y+z));
	}
	
	int sum(int[] answers)
	{
		int res=0;
		for(int i =0;i<answers.length;i++)
		{
			res = answers[i]+res;
		}
		return res;
	}
}
