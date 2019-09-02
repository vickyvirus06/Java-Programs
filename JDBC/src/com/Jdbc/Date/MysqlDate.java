package com.Jdbc.Date;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.Jdbc.Util.JdbcUtil;

public class MysqlDate {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		PreparedStatement pst = null;
		Date date = new Date();
		SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd");
		String dt = simple.format(date);
		
		try
		{
			con= JdbcUtil.getMysql();
			String query = "Insert into test_date values(?,?)";
			pst = con.prepareStatement(query);
			pst.setInt(1, 101);
			pst.setString(2, dt.toString());
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
