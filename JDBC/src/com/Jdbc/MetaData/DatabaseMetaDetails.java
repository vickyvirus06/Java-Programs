package com.Jdbc.MetaData;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.Jdbc.Util.JdbcUtil;

public class DatabaseMetaDetails {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		Statement st = null;
		
		try
		{
			con= JdbcUtil.getMysql();
			System.out.println("\n=====DatabaseSetMetaData==============\n");
			
			DatabaseMetaData db_meta = con.getMetaData();
			System.out.println(db_meta.getDriverMajorVersion());
			System.out.println(db_meta.getDriverMinorVersion());
			System.out.println(db_meta.getDriverName());
			System.out.println(db_meta.getDriverVersion());
			
			
			System.out.println("\n=====ResultSetMetaData==============\n");
			st = con.createStatement();
			ResultSet rs = st.executeQuery("Select * from employee");
			
			ResultSetMetaData rs_meta = rs.getMetaData();
			
			System.out.println(rs_meta.getColumnCount());
			System.out.println(rs_meta.getTableName(1));
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			con.close();
			st.close();
		}

	}

}
