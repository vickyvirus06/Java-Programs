package com.corejava.Inheritance;

public class InheritanceFlow {
	
	public static void main(String[] args) {
		
		System.out.println("Case 1 calling static variable of Parent Class");
		System.out.println(Parent.b);
		System.out.println("Case 2 calling static variable of Child Class");
		System.out.println(Child.y);
		System.out.println("Case 3 Creating object of Parent Class");
		Parent parent = new Parent();
		System.out.println("Case 4 Creating object of Child Class");
		Child child = new Child();
	}
	
}


class Parent
{
	int a=10;
	static int b = 50;
	{
		System.out.println("This is IIB Block of Parent ");
	}
	
	static{
		System.out.println("This is SIB Block of Parent ");
	}
}

class Child extends Parent
{
	int x=20;
	static int y = 30;
	{
		System.out.println("This is IIB Block of Child ");
	}
	
	static{
		System.out.println("This is SIB Block of Child ");
	}
}