package com.corejava.Exception;

public class TryCatch {

	public static void main(String[] args) {
		
		try {
			String s= args[0];
			int i = 100/0;
			String k = null;
			System.out.println(s.length());
		}
		catch(Exception e)
		{
			if(e instanceof ArrayIndexOutOfBoundsException)
			{
				System.out.println("Pass Command Line Argument");
			}
			if(e instanceof ArithmeticException)
			{
				System.out.println("Divide by zero not possible");
			}
			if(e instanceof NullPointerException)
			{
				System.out.println("Null value stored");
			}
		}
		

	}

}


