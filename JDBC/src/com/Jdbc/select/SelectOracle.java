package com.Jdbc.select;

import java.security.interfaces.RSAKey;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectOracle {

	public static void main(String[] args) {
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","vicky","virus");
			String query = "Select * from employee";
			Statement st = con.createStatement();
			ResultSet res = st.executeQuery(query);
			
			while(res.next())
			{
				System.out.println(res.getInt("id")+"\t"+res.getString("name")+"\t"+res.getString("salary"));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
