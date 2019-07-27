package com.corejava.DesignPattern;

public class Singleton3 {

	public static void main(String[] args) {
		System.out.println(Type3.getType());

	}

}

class Type3
{
	private Type3()
	{
		
	}
	private static Type3 type=null;
	
	static Type3 getType()
	{
		if(type==null)
		{
			type=new Type3();
		}
		
		return type;
	}
}
