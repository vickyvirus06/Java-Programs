package com.corejava.Object;

public class StaticAndInstantce {

	public static void main(String[] args) {
		
		Demo demo1 = new Demo();
		demo1.show();
		Demo demo2 = new Demo();
		demo2.show();
		
		Demo.b= 34;
	
		System.out.println("This is Demo 1 object ");
		demo1.show();
		
		System.out.println("This is Demo 2 object ");
		
		demo2.show();
		

	}

}

class Demo
{
	int i=10;
	static int b =20;
	
	
	void show()
	{
		System.out.println("i "+ i);
		System.out.println("b "+ b);

	}
}