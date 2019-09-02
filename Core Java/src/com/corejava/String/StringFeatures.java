package com.corejava.String;

public class StringFeatures {

	public static void main(String[] args) {
		String st1 = "vicky";
		String st2="vicky";
		
		System.out.println(st1==st2);
		
		System.out.println("-- Now using new keyword");
		
		String st3 = new String("poojari");
		String st4 = new String("poojari");
		
		System.out.println("--Now comparing using string object");
		
		System.out.println(st3==st4);
		System.out.println("----Now using intern method");
		System.out.println(st3.intern()==st4.intern());
		
		
	}

}
