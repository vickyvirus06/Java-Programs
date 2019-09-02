package com.Jdbc.Date;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.Jdbc.Util.JdbcUtil;

public class OracleDate
{

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		PreparedStatement pst = null;
		Date date = new Date();
		String dt = null;
		try
		{
			con= JdbcUtil.getOracle();
			//con= JdbcUtil.getMysql();
			String query = "Insert into test_date values(?,?)";
			pst = con.prepareStatement(query);
			pst.setInt(1, 101);
			DatabaseMetaData dmdt = con.getMetaData();
			String database_name = dmdt.getDriverName();
			
			if(database_name.equals("MySql"))
			{
				SimpleDateFormat simple = new SimpleDateFormat("dd-MM-YYYY");
				dt = simple.format(date);
				
			}
			else if(database_name.equals("Oracle"))
			{
				SimpleDateFormat simple = new SimpleDateFormat("dd-MM-YY");
				dt = simple.format(date);
				
			}
			pst.setString(2, dt);
			pst.execute();
			
			System.out.println("Data Inserted");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			con.close();
			pst.close();
		}

	}

}
