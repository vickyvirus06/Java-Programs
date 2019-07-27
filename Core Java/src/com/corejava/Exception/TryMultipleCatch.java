package com.corejava.Exception;

public class TryMultipleCatch {

	public static void main(String[] args) {
		
		try {
			String s= args[0];
			int i = 100/0;
			String k = null;
			System.out.println(s.length());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Pass Command Line Argument");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Number cant be Divide by zero");
		}
		catch(NullPointerException e)
		{
			System.out.println("Null value stored");
		}
		catch(Exception e)
		{
			System.out.println("Exception caught but type not found");
		}
		

	}

}


