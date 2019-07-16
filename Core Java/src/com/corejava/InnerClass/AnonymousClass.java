package com.corejava.InnerClass;

public class AnonymousClass {

	public static void main(String[] args) {
		
		Hello h1 = new Hello() {
			void show()
			{
				System.out.println("Hello vicky");
			}
		};
		h1.show();

	}

}

class Hello
{
	void show()
	{
		System.out.println("Hello welcome ");
	}
}