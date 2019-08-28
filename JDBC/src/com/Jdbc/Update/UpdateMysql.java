package com.Jdbc.Update;

import java.sql.*;
import java.sql.DriverManager;



public class UpdateMysql {

	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sjt","vicky","virus");
			String query = "Update student set name = 'Ambi' where id = 101";
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
			
		}

	}

}
