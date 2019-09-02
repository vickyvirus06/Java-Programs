package com.CollectionsFramework.List.LinkedList;

import java.util.LinkedList;

public class LinkedListMethods {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		
		ll.add("vicky");
		ll.add("karan");
		ll.add("ambi");
		ll.add("sneha");
		
		ll.remove();
		System.out.println(ll);
		ll.add("premila");
		ll.remove("karan");
		System.out.println(ll);

	}

}
