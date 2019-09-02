package com.CollectionsFramework.Map.LinkedHashMap;

import java.util.Collection;
import java.util.Iterator;
import java.util.*;
import java.util.Set;

public class LinkedHashMapMethods {

	public static void main(String[] args) {
		LinkedHashMap hash = new LinkedHashMap();
		
		hash.put(101, "vicky");
		hash.put(103, "ambi");
		hash.put(102, "shiva");
		hash.put(104, "hidayath");
		
		Set keys = hash.keySet();
		
		Iterator it_keys = keys.iterator();
		
		//First technique
		while (it_keys.hasNext()) {
			Object key = (Object) it_keys.next();
			
			System.out.println(key+"\t"+hash.get(key));
			
			
		}
		
		System.out.println("\nSecond way getting values ------\n");
		Collection value = hash.values();
		
		Iterator it_value = value.iterator();
	
		while (it_value.hasNext()) {
			Object val = (Object) it_value.next();
			System.out.println(val);
		}
		

		System.out.println("\nThird Way getting values using entry set\n");
		Set key_values = hash.entrySet();
		
		Iterator it_keys_values = key_values.iterator();
		
		while (it_keys_values.hasNext()) {
			Object object = (Object) it_keys_values.next();
			System.out.println(object);
			
		}
		 it_keys_values = key_values.iterator();
		 
		System.out.println("\nUsing Map.Entry ");
		
		while (it_keys_values.hasNext()) {
			Map.Entry data = (Map.Entry)it_keys_values.next();
			Object id = (Object)data.getKey();
			Object name =(Object)data.getValue();
			System.out.println(id+"\t"+name);
			
		}

	}

}
