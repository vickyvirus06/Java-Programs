package com.corejava.DesignPattern;

public class Singleton1 {

	public static void main(String[] args) {
		
		Type1.getType();
		

	}

}

class Type1
{
	private static final Type1 type = new Type1();
	
	private Type1()
	{
		
	}
	
	static Type1 getType()
	{
		return type;
	}
}
