package com.corejava.Method;

public class LocalVariable {
	
	public static void main(String[] args) {
	
		LocalVariableTest test = new LocalVariableTest();
		test.show();
	}
	
	

}


class LocalVariableTest
{
	int a =10;
	
	{
		
		{
			int b =20;
			int a = 40;
			System.out.println(b);
		}
		int b =90;
		System.out.println(b);
	}
	
	
	LocalVariableTest()
	{
		int k =80;
		System.out.println(k);
		//System.out.println(b);
	}
	
	
	void show()
	{
		int a=40;
		System.out.println(a);
		System.out.println(this.a);
	}
	
	
}