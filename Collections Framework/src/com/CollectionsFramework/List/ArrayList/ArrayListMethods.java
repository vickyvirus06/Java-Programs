package com.CollectionsFramework.List.ArrayList;

import java.util.*;
public class ArrayListMethods {

	public static void main(String[] args) {
		Collection col = new ArrayList();
		
		col.add("suraj");
		col.add("shiva");
		col.add("hidayath");
		col.add("premila");
		
		Collection col1 = new ArrayList();
		
		col1.add("ambi");
		col1.add("vicky");
		
		col.remove("suraj");
		
		System.out.println(col);
		col.removeAll(col);
		System.out.println(col);
		col.add(col1);
		System.out.println(col);
		
		
	}

}
