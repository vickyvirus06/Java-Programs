package com.corejava.Method;

public class CallByReferenceTest {

	public static void main(String[] args) {
		
		CallByReference test = new CallByReference();
		CallByReferenceDemo test1 = new CallByReferenceDemo();
		
		test.show(test1);
		System.out.println("Value of x in main " + test1.x);

	}

}

class CallByReference
{
	void show(CallByReferenceDemo reference)
	{
		System.out.println("Value of x in Call By Reference Demo class is " + reference.x);
		reference.x=80;
		System.out.println("Value of x after changing  " + reference.x);
	}
}

class CallByReferenceDemo
{
	int x =10;
}