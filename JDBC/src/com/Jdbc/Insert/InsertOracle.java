package com.Jdbc.Insert;

import java.sql.*;

public class InsertOracle {

	public static void main(String[] args) {
		try
		{
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","vicky","virus");
			String query = "Insert into student values(103,'ambi','blore')";
			Statement st = con.createStatement();
			int res = st.executeUpdate(query);
			
			if(res>0)
			{
				System.out.println(res +"  records Effected");
			}
			else
			{
				System.out.println("Db not effected");
			}
			
			st.close();
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
