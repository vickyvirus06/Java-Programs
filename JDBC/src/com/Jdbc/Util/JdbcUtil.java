package com.Jdbc.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class JdbcUtil {
	
	public static Connection getMysql() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sjt","vicky","virus");
		return con;
		
	}
	
	public static Connection getOracle() throws ClassNotFoundException, SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","vicky","virus");
		return con;
	}
	
	public static void closeConnection(Connection con,Statement st)
	{
		try {
			if(con!=null)
			con.close();
			
			if(st!=null)
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void closeConnection(Connection con,Statement st,ResultSet rs)
	{
		try {
			if(con!=null)
			con.close();
			
			if(st!=null)
			st.close();
			
			if(rs!=null)
				rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
