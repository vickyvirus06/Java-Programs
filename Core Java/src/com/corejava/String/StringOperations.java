package com.corejava.String;

public class StringOperations {

	public static void main(String[] args) {
		String st= new String();
		
		st=st.concat("VICKY");
		System.out.println(st);
		
		System.out.println("--Passing char array in String");
		char[] ch = {'W','O','R','L','D'};
		String st1 = new String(ch);
		
		System.out.println(st1);
		
		System.out.println("\n--Using Byte array\n");
		
		byte[] by = {65,66,67,68,69};
		String st2 = new String(by);
		System.out.println(st2);
		
		System.out.println("\n---Use charAt function");
		String st3 = "Vicky";
		System.out.println(st3.charAt(0));
		
		System.out.println("\n--Use length function");
		System.out.println(st3.length());
		
		
		System.out.println("\n---Now first index");
		
		String st4 = "Hello World";
		System.out.println(st4.indexOf('o'));
		System.out.println(st4.indexOf('o', st4.indexOf('o')+1));
		System.out.println("\nLast index ");
		
		String st5 = "Vicky Poojari";
		System.out.println(st5.lastIndexOf('i'));
		System.out.println(st5.lastIndexOf('i', st5.indexOf('i')-1));
		
	}

}
