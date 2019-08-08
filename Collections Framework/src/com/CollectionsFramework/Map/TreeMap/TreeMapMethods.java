package com.CollectionsFramework.Map.TreeMap;

import java.util.*;
import java.util.Map.Entry;

public class TreeMapMethods {

	public static void main(String[] args) {
		TreeMap tree = new TreeMap();
		tree.put(101, "vicky");
		tree.put(104, "ambi");
		tree.put(103, "sam");
		tree.put(102, "kunal");
		/*tree.put("id", "rahul");
		tree.put(true,"shiva");*/
		
		System.out.println(tree);
		System.out.println("\nUsing Map.Entry");
		Set data = tree.entrySet();
		
		Iterator it = data.iterator();
		
		while (it.hasNext()) {
			Map.Entry keys_values = (Map.Entry) it.next();
			
			Object id = keys_values.getKey();
			Object name = keys_values.getValue();
			
			System.out.println(id+"\t"+name);
			
		}
	}

}
