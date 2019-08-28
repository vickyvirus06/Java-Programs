package com.Jdbc.Insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

import com.Jdbc.Util.JdbcUtil;

public class UserInputOracle {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Connection con = null;
		Statement st = null;
		int id = 0;
		String name = null;
		float salary = 0;
		int res = 0;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","vicky","virus");
			st= con.createStatement();
			System.out.print("\nHow Many Employee details you want to enter  :   ");
			int choice = input.nextInt();
			for (int i = 0; i < choice; i++) {
				System.out.print("\nEnter Id  :   ");
				id = input.nextInt();
				System.out.print("\nEnter Name  :   ");
				name = input.next();
				System.out.print("\nEnter Salary  :   ");
				salary = input.nextFloat();
				String query = "Insert into employee values("+id+",'"+name+"',"+salary+")";
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
		
		
		System.out.println("\n");
	
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


