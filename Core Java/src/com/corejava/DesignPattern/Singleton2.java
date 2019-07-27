package com.corejava.DesignPattern;

public class Singleton2 {

	public static void main(String[] args) {
	
		Type2.getType();

	}

}

class Type2
{
	private Type2()
	{
		
	}
	
	private static final Type2 type;
	
	static {
		type=new Type2();
	}
	
	static Type2 getType()
	{
		return type;
	}
}
