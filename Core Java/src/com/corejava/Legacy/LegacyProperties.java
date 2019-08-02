package com.corejava.Legacy;

import java.util.Properties;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class LegacyProperties {

	
	public static void main(String[] args) {
		Properties p = new Properties();
		
		p.put("name", "vicky");
		p.put("mobileno", "8286337928");
		p.put("city", "mumbai");
		
		
		
		Enumeration en = p.propertyNames();
		
		while (en.hasMoreElements()) {
			String key =(String) en.nextElement();
			Object value = (Object)p.getProperty(key);
			System.out.println(key+"\t"+value);
			
			
			
		}
		
		
		
		
		
		
		
		
		
	}

}
