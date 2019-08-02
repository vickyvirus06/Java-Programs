package com.CollectionsFramework.Set.LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.*;

public class LinkedHashSetMethods {

	public static void main(String[] args) {
		LinkedHashSet lhash = new LinkedHashSet();
		lhash.add("vicky");
		lhash.add("nancy");
		lhash.add("premila");
		lhash.add("ambi");
		lhash.add("hidayath");
		lhash.add("nancy");
		lhash.add("ambi");
		
		Iterator it = lhash.iterator();
		
		while (it.hasNext()) {
			String name = (String) it.next();
			System.out.println(name);
		}

	}

}
