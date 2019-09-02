package com.CollectionsFramework.Set.TreeSet;

import java.util.*;

public class TreeSetMethods {

	public static void main(String[] args) {
		TreeSet tree = new TreeSet();
		
		tree.add("ramesh");
		tree.add("kunal");
		tree.add("sameer");
		tree.add("sneha");
		tree.add("nayana");
		//tree.remove("sneha");
		Iterator it = tree.descendingIterator();
		
		
		System.out.println(tree);
		
		//Iterator it = tree.iterator();
		
		/*while (it.hasNext()) {
			String name = (String) it.next();
			System.out.println(name);
		}*/
		
		TreeSet tree1= (TreeSet)tree.headSet("nayana");
		System.out.println(tree1);
	
		tree1=(TreeSet)tree.tailSet("nayana");
		System.out.println(tree1);
		
		
		tree1=(TreeSet)tree.subSet("nayana", "sneha");
		
		System.out.println(tree1);
	}

}
