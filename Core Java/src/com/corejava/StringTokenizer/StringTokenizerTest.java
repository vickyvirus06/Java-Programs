package com.corejava.StringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		String name = "Vicky is a Java Programmer";
		
		StringTokenizer st = new StringTokenizer(name);
		while (st.hasMoreElements()) {
			String data = (String) st.nextElement();
			System.out.println(data);
			
		}
		System.out.println("=======================");
		StringTokenizer st1 = new StringTokenizer(name, "Java");
		while (st1.hasMoreElements()) {
			String data = (String) st1.nextElement();
			System.out.println(data);
			
		}
		

	}

}
