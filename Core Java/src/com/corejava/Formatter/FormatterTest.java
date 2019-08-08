package com.corejava.Formatter;

import java.util.Date;
import java.util.Formatter;

public class FormatterTest {

	public static void main(String[] args) {
		Formatter format = new Formatter();
		Date date = new Date();
		int k =10;
		int v=k+30;
		
		String data = format.format("k is %d and v is %d ", k,v).toString();
		
		System.out.println(data);
		
		System.out.println("===================");
		
		System.out.printf("%Td %Tm %Ty ",date,date,date);
		System.out.println();
		
		System.out.println("========================================");
		format=new Formatter();
		String data1 = format.format("%Td %Tm %Ty %",date,date,date,date).toString();
		System.out.println(data1);
		

	}

}
