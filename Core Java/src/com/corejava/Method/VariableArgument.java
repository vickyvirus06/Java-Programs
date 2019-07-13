package com.corejava.Method;

public class VariableArgument {

	public static void main(String[] args) {
		VariableArgumentTest test = new VariableArgumentTest();
		test.sum(10, 11);
		
		test.sum(10,33,78,676,98);
		test.sum("hello",78,16,65);

	}

}

class VariableArgumentTest
{
	void sum(int a,int b)
	{
		System.out.println("Sum is " +(a+b));
	}
	
	void sum(int...args)
	{
		int sum=0;
		for (int i = 0; i < args.length; i++) {
			sum= sum+args[i];
		}
		System.out.println(sum);
	}
	
	void sum(String h,int...args)
	{
		int sum=0;
		for (int i = 0; i < args.length; i++) {
			sum= sum+args[i];
		}
		System.out.println(sum);
	}
}
