package com.corejava.DesignPattern;

public class Singleton4 {

	public static void main(String[] args) {
		Type4.getType();
		
		System.out.println(Type4.getType());
		

	}

}

class Type4
{
	private static final Type4 type = new Type4();
	private Type4()
	{
		
	}
	
	static Type4 getType()
	{
		return type;
	}
	
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
	
		return type;
	}
}
