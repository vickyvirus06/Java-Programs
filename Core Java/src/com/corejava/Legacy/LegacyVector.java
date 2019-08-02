package com.corejava.Legacy;

import java.util.Enumeration;
import java.util.Vector;

public class LegacyVector {
	@SuppressWarnings({ "rawtypes", "unchecked"})
	public static void main(String[] args) {
		
		Vector v = new Vector();
		v.add("101");
		v.add("vicky");
		v.add("mumbai");
		
		for (Object object : v) {
			System.out.println(object);
		}
		Enumeration en = v.elements();
		
		while (en.hasMoreElements()) {
			Object type = (Object) en.nextElement();
			System.out.println(type);
			
		}
	}

}
