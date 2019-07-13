package com.corejava.Method;

public class CallByValueTest {

	public static void main(String[] args) {
	
		int a =10;
		CallByValue test = new CallByValue();
		test.show(a);
		System.out.println("Value of a in main " + a);

	}

}


class CallByValue
{
	void show(int a)
	{
		System.out.println("value of a before modify " + a);
		a = 80;
		System.out.println("value of a after modify " + a);
	}
}