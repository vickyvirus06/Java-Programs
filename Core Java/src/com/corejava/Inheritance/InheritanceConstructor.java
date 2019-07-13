package com.corejava.Inheritance;

public class InheritanceConstructor {
	public static void main(String[] args) {
		ChildDemo child = new ChildDemo(11,22,44,66);
		child.show();
	}
	

}

class ParentDemo
{
	int a,b;
	
	ParentDemo(int a ,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	void show()
	{
		System.out.println("a   :  " +a);
		System.out.println("b   :  " +b);
	}
}

class ChildDemo extends ParentDemo
{
	int x,y;
	
	ChildDemo(int a ,int b,int x,int y)
	{
		super(a,b);
		this.x = x;
		this.y = y;
	}
	
	void show()
	{
		super.show();
		System.out.println("x   :  " + x);
		System.out.println("y   :  " +y);
	}
	
}