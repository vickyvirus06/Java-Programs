package com.Jdbc.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertMysql {

	public static void main(String[] args) {
		
		try
		{
			System.out.println("Step 1 Load Driver Class");
			Class.forName("com.mysql.jdbc.Driver");
			
			System.out.println("Step 2 Create Connection  ");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sjt","vicky","virus");
			
			System.out.println("Step 3 Sql  Query ");
			String query = "Insert into student values(101,'vicky','blore')";
		
			System.out.println("Step 4 JDBC Statement");
			Statement st = con.createStatement();
			
			System.out.println("Step 5 Execute query");
			int res = st.executeUpdate(query);
			
			System.out.println("Step 6 Processing result");
			if(res>0)
			{
				System.out.println(res + "  records Effected");
			}
			else
			{
				System.out.println("Db not effected");
			}
			
			System.out.println("Step 6 Closing Connection");
			
			st.close();
			con.close();
		}
		catch(Exception e)
		{
			
		}

	}

}
