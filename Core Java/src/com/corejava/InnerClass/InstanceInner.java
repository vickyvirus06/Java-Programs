package com.corejava.InnerClass;

public class InstanceInner {

	public static void main(String[] args) {
		System.out.println("--------------------Outer Class");
		Outer outer = new Outer();
		outer.show();
		
		System.out.println("\n-------------------Inner Class");
		Outer.Inner inner = outer.new Inner();
		outer.show();
		
		System.out.println("\n--------------Another technique to use inner class");
		
		Outer.Inner inner1 = new Outer().new Inner();
		inner1.show();

	}

}

class Outer
{
	int a =10;
	int b =20;
	
	class Inner
	{
		int a =60;
		int d =80;
		
		void show()
		{
			System.out.println(a);
			System.out.println(b);
			System.out.println(d);
		}
	}
	
	void show()
	{
		System.out.println(a);
		System.out.println(b);
		//System.out.println(d);
	}
}
