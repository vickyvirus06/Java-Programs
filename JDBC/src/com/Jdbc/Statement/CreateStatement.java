package com.Jdbc.Statement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.Jdbc.Util.JdbcUtil;

public class CreateStatement {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		boolean flag = false;
		try
		{
			con = JdbcUtil.getMysql();
			String query = "Select * from student";
			st = con.createStatement();
			flag = st.execute(query);
			
			if(flag)
			{
				rs = st.getResultSet();
				
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
				}
				
				System.out.println("Select Query");
			}
			else
			{
				System.out.println("Insert , Update And Delete Query");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		JdbcUtil.closeConnection(con, st,rs);

	}

}
