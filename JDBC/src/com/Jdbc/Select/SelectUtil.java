package com.Jdbc.Select;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.Jdbc.Util.JdbcUtil;


public class SelectUtil {

	public static void main(String[] args) {
		
		Connection con = null;
		Statement st = null;
		ResultSet res = null;
		
		System.out.println("Mysql Database data of Student \n");
		try
		{
			con = JdbcUtil.getMysql();
			String query = "Select * from student";
			st = con.createStatement();
			res = st.executeQuery(query);
			
			while(res.next())
			{
				System.out.println(res.getInt(1)+"\t"+res.getString(2)+"\t"+res.getString(3));
			}
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("\n============================================");
		System.out.println("Oracle Database data of Employee \n");
		try
		{
			con = JdbcUtil.getOracle();
			String query = "Select * from employee";
			st = con.createStatement();
			res = st.executeQuery(query);
			
			while(res.next())
			{
				System.out.println(res.getInt(1)+"\t"+res.getString(2)+"\t"+res.getString(3));
			}
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		JdbcUtil.closeConnection(con, st);
	}

}
