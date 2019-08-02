package com.CollectionsFramework.List.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ReverseList {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("vicky");
		al.add("ambi");
		al.add("hidayath");
		al.add("premila");
		al.add("shiva");
		al.add("vicky");
		al.add(null);
		al.add(null);
		
		ListIterator list = al.listIterator();
		
		
		while(list.hasNext())
		{
			String obj = (String) list.next();
			
		}
		
		
		
		while(list.hasPrevious())
		{
			
			String name = (String) list.previous();
			
		}
		
		System.out.println(al);
			
	
	}

}
