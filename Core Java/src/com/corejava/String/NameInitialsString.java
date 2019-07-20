package com.corejava.String;

import com.corejava.BuiltInPackages.ToString;

public class NameInitialsString {
	
	public static void main(String[] args) {
		String name = "Narendra Damodardas Modi";
		String fname="";
		String lname="";
		
/*		for(int i=0;i<name.length();i++)
		{
			ch[i]=name.charAt(i);
			
			//System.out.print(" " + name.charAt(i));
			
		}
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=(char)32) {
				fname=fname+ch[i];
				
			}
			else
			{
				for(int j=0;j<1;j++)
				{
					System.out.print(fname.charAt(0)+" ");
					fname="";
				}
			}
		}*/
		
		for(int i=0;i<name.length();i++)
		{
			fname=fname+name.charAt(i);
			if(name.charAt(i)==(char)32)
			{
				System.out.print(fname.charAt(0)+ " ");
				fname="";
			}
		}
		
		outer : for(int i=name.length()-1;i>=0;i--)
		{
			lname=lname+name.charAt(i);
			if(name.charAt(i)==(char)32)
			{
				break outer;
			}
			
		}
		
		for(int i=lname.length()-1;i>=0;i--)
		{
			System.out.print(lname.charAt(i));
		}
		
	}

}
