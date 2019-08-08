package com.corejava.ResourceBundle;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ResourceBundle;
import java.util.Set;

public class ResourceBundleTest {

	public static void main(String[] args) {
		ResourceBundle resource = ResourceBundle.getBundle("Data");
		Enumeration enm = resource.getKeys();
		Set set = resource.keySet();
		
		Iterator it = set.iterator();
		
		while (it.hasNext()) {
			String key = (String) it.next();
			System.out.println(key + "\t" +resource.getObject(key));
		}
		/*while (enm.hasMoreElements()) {
			String key = (String) enm.nextElement();
			System.out.println(key + "\t" +resource.getObject(key));
		}*/

	}

}
