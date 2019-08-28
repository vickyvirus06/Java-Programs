package com.Jdbc.Insert;


import java.util.Scanner;

import com.Jdbc.Util.JdbcUtil;
import java.sql.*;


public class UserInputMysql {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Connection con = null;
		Statement st = null;
		int id = 0;
		String name = null;
		String city = null;
		int res = 0;
		try
		{
			con= JdbcUtil.getMysql();
			st= con.createStatement();
			System.out.print("\nHow Many Student details you want to enter  :   ");
			int choice = input.nextInt();
			for (int i = 0; i < choice; i++) {
				System.out.print("\nEnter id  :   ");
				id = input.nextInt();
				System.out.print("\nEnter name  :   ");
				name = input.next();
				System.out.print("\nEnter city  :   ");
				city = input.next();
				String query = "Insert into student values("+id+",'"+name+"','"+city+"')";
				res = st.executeUpdate(query)+res;
				
				
				
			}
			
			con.close();
			st.close();
			input.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
	
		if(res>0)
		{
			System.out.println(res + " records effected");
		}
		else
		{
			System.out.println("DB not effected");
		}
		
		System.out.println("\nThanks for using");
	}

}
