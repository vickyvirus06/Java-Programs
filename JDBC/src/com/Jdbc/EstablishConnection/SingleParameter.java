package com.Jdbc.EstablishConnection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class SingleParameter {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try
		{
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sjt?user=vicky&password=virus");
			st = con.createStatement();
			rs = st.executeQuery("Select * from student");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			con.close();
			st.close();
			rs.close();
		}
	}

}
