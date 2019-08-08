package com.corejava.DateAndTime;

import java.util.Date;

public class DateAndTime {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		System.out.println("Date : " +date.getDate());
		System.out.println("Week Day : " +date.getDay());
		System.out.println("Month : " +date.getMonth());
		System.out.println("Year : " +date.getYear());
		System.out.println("============");
		
		System.out.println("Hours : "+ date.getHours());
		System.out.println("Minutes : " +date.getMinutes());
		
		
		
		

	}

}
