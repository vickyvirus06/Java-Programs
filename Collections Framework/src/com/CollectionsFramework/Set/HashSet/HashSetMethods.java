package com.CollectionsFramework.Set.HashSet;

import java.util.HashSet;
import java.util.*;

public class HashSetMethods {

	public static void main(String[] args) {
		HashSet hash = new HashSet();
		hash.add("vicky");
		hash.add("hidayath");
		hash.add("nancy");
		hash.add("premila");
		hash.add("ambi");
		
		hash.remove("ambi");
		
		Iterator it = hash.iterator();
		
		while (it.hasNext()) {
			String type = (String) it.next();
			System.out.println(type);
		}

	}

}
