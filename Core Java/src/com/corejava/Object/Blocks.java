package com.corejava.Object;

public class Blocks {

	public static void main(String[] args) {
		
		
		
		Test test = new Test();
		

	}

}

class Test
{
	int a=10;
	static int b=20;
	{
		System.out.println("IIB-1");
		System.out.println(a);
		System.out.println(b);
	}
	
	static{
		System.out.println("SIB-1");
		
		System.out.println(b);
	}
		
	static{
		
		System.out.println("SIB -2");
		System.out.println(b);
	}
	 
	{
		a =10;
		System.out.println("IIB-2");
		System.out.println(a);
		System.out.println(b);
		
	}
	
	
	
	
	static{
		b=99;
		System.out.println("SIB -3");
		System.out.println(b);
	}
	{
		System.out.println("IIB-3");
		System.out.println(a);
		System.out.println(b);
		
	}
}