package com.CollectionsFramework.List.ArrayList;

import java.util.Arrays;

public class CustomArrayList {

	public static void main(String[] args) {
		System.out.println(System.nanoTime());
		MyArrayList ml = new MyArrayList();
		ml.add("vicky");
		ml.add("rahul");
		ml.add("karan");
		ml.remove("rahul");
		ml.add("shiva");
		ml.remove("karan");
		ml.add("sneha");
		ml.add("satish");
		ml.remove("sneha");
		ml.add("nandini");
		ml.add("ramesh");
		ml.remove("shiva");
		ml.add("ambi");
		ml.add("sameer");
		
		ml.add("rakesh");
		ml.add("sameer");
		ml.remove("vicky");
		//ml.display();
		System.out.println(ml);
		
		System.out.println(System.nanoTime());

	}

}

class MyArrayList
{
	Object[] obj = new Object[1];
	
	public void add(Object data)
	{
		outer:for (int i = 0; i < obj.length; i++) {
			
			try {
			if(obj[i]==null)
			{
				obj[i]=data;
				//System.out.println(obj[i]);
				obj = Arrays.copyOf(obj, obj.length + 1);
				break outer;
				
			}
			else
			{
				
			}
			}
			catch(Exception e)
			{
				
			}
			
		}
		
		
		
	    
	    

		
		
	}
	
	public void remove(Object data)
	{
		outer: for (int i = 0; i < obj.length-1; i++) {
			
			if(obj[i].equals(data))
			{
				for (int j = i; j < obj.length-1; j++) {
					obj[j]=obj[j+1];
				}
				obj = Arrays.copyOf(obj, obj.length - 1);
				break outer;
				
			}
		}
	
	}
	
	public void removeAll()
	{
		for (int i = 0; i < obj.length; i++) {
			
			obj[i]=null;
			obj=Arrays.copyOf(obj, 1);
				
			}
		}
	
	
	public void display()
	{
		
	    for (int i = 0; i < obj.length-1; i++) {
			System.out.println(obj[i]);
		}
	}
	
	@Override
	public String toString() {
		String data="[";
		for (int i = 0; i < obj.length-1; i++) {
			
			
			if(i!=obj.length-1)
				data=data+obj[i]+" ,";
		}
		data=data+"]";
		return data;
	}
	
}