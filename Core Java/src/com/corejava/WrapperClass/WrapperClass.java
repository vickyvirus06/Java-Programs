package com.corejava.WrapperClass;

public class WrapperClass {

	public static void main(String[] args) {
		Integer i1=128;
		Integer i2=128;
		
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));
		
		Byte by = 20;
		
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);

		Integer i3=30;
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
	
		Float f1=20.0f;
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		
		Overload o =  new Overload();
		byte a=54;
		byte b=65;
		o.add(a,b);
		
		o.show();
		
		String s= "123";
		System.out.println(Integer.parseInt(s));		
	}

}

class Overload
{
	void add(int a,int b)
	{
		System.out.println("add(int,int)");
	}
	
	void add(Byte a,Byte b)
	{
		System.out.println("add(Byte,Byte)");
	}
	
	Void show()
	{
		return null;
	}
}