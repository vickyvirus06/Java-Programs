package com.corejava.Method;
import java.util.*;


public class MethodOverloading {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);;
		MethodOverloadingTest test = new MethodOverloadingTest();
		test.show();
		test.show((byte)10);
		test.show((short)20);
		test.show(30);
		test.show('A');
		test.show(35.6f);
		test.show(8286337928l);
		test.show(input);

	}

}


class MethodOverloadingTest
{
	
	void show()
	{
	System.out.println("empty method");	
		
	}
	
	void show(byte b)
	{
		System.out.println("byte");
	}
	void show(short s)
	{
		System.out.println("short");
	}
	void show(int i)
	{
		System.out.println("int");
	}
	void show(char ch)
	{
		System.out.println("char");
	}
	void show(long l)
	{
		System.out.println("long");
	}
	
	void show(float f)
	{
		System.out.println("float");
	}
	
	void show(double d)
	{
		System.out.println("double");
	}
	
	void show(Scanner obj)
	{
		System.out.println("Object");
	}
}
