package com.corejava.Java8Features;

public class DefaultInterface {

	public static void main(String[] args) {
		
		I1 i = new A();
		
		i.show();
		
		i.display();
		
		I1.greet();

	}

}


interface I1
{
	void show();
	
	default void display()
	{
		System.out.println("This is Disp()------I1");
	}
	
	static void greet()
	{
		System.out.println("Good Afternoon  static()----------I1");
	}
	
}

class A implements I1
{

	@Override
	public void show() {
		System.out.println("Show()------------A");
		
	}
	
}