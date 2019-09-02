package com.corejava.InnerClass;

import com.sun.webkit.ContextMenu.ShowContext;

public class LocalInnerClass {

	public static void main(String[] args) {
		
		LocalOuter outer = new LocalOuter();
		outer.show();

	}

}

class LocalOuter
{
	int a =10;
	int c =50;
	
	
	void show()
	{
		class Inner
		{
			int a =90;
			int b=89;
			
			void display()
			{
				System.out.println("a    :  " +a);
				System.out.println("b    :  " +b);
			}
		}
		System.out.println("a    :  " +a);
		System.out.println("c    :  " +c);
	}
	Outer.Inner inner = new Outer().new Inner();
	
	
}