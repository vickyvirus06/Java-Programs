package com.Jdbc.select;

import java.sql.*;

public class SelectMysql {

	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sjt","vicky","virus");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("Select * from student");
			
			while(rs.next())
			{
				System.out.println(rs.getInt("id")+"\t"+rs.getString("name")+"\t"+rs.getString("city"));
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
