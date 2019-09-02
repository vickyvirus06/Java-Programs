package com.CollectionsFramework.CollectionsClass;

import java.util.*;

public class CollectionsClass {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("vicky");
		al.add("ambi");
		al.add("shiva");
		al.add("nandini");
		al.add("nancy");
		al.add("premila");
		
		Collections.sort(al);
		System.out.println(al);
		Collections.shuffle(al);
		System.out.println(al);
		
		System.out.println(Collections.binarySearch(al, "shiva"));
	}

}
