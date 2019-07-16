package com.corejava.BuiltInPackages;

public class ObjectClassFunction {

	public static void main(String[] args) {
		Hello h1 = new Hello();
		
		Class cl = h1.getClass();
		System.out.println(cl.getName()+"\n" + cl.getSuperclass());

	}

}

class Hello
{
	int a =10;
	int c =90;
	
	void show()
	{
		System.out.println("a : " +a);
		System.out.println("c : " +c);
	}
}
