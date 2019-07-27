package com.corejava.Exception;

public class TryCatchFinally {

	public static void main(String[] args) {
		try {
			String s= args[0];
			int i = 100/0;
			String k = null;
			System.out.println(k.length());
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Number cant be Divide by zero");
		}
		catch(NullPointerException e)
		{
			System.out.println("Null value stored");
		}
		finally {
			System.out.println("Final method");
		}


	}

}
