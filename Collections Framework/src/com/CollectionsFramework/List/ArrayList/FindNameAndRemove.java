package com.CollectionsFramework.List.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class FindNameAndRemove {

	public static void main(String[] args) {
		boolean flag=false;
		ArrayList al = new ArrayList();
		al.add("vicky");
		al.add("ambi");
		al.add("hidayath");
		al.add("premila");
		al.add("shiva");
		al.add("sneha");
		
		al.remove(5);
		
		Iterator it = al.iterator();
		
	
		while(it.hasNext())
		{
			String obj = (String) it.next();
			
			if(obj.equalsIgnoreCase("ambi"))
			{
				it.remove();
				flag=true;
			}
		}
		
		if(flag)
		{
			System.out.println("Name found and deleted");
		}
		else
			System.out.println("Name not found");
		
		
		System.out.println(al);
	}


}
