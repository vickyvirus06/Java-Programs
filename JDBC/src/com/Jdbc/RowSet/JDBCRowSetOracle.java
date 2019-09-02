package com.Jdbc.RowSet;

import java.sql.SQLException;

import javax.sql.RowSet;

import com.sun.rowset.JdbcRowSetImpl;

public class JDBCRowSetOracle {

	public static void main(String[] args) throws SQLException {
		RowSet rs=null;
		try {
			rs=new JdbcRowSetImpl();
			
			rs.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
			rs.setUsername("vicky");
			rs.setPassword("virus");
			
			rs.setCommand("select * from employee");
			
			rs.execute();
			
			while(rs.next()){
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			rs.close();
		}


	}

}
