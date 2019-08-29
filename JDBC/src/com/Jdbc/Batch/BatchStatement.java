package com.Jdbc.Batch;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Arrays;

import com.Jdbc.Util.JdbcUtil;

public class BatchStatement {

	public static void main(String[] args) {
		
		Connection con = null;
		Statement st = null;
		
		
		try
		{
			con=JdbcUtil.getMysql();
			st = con.createStatement();
			
			String query1 = "Insert into student values(108,'sneha','mumbai')";
			String query2 = "Insert into student values (109,'premila','bidar')";
			String query3 = "Update student set city = 'Bangalore' where name like 'vicky'";
			String query4 = "Delete from student where id = 106";
			
			st.addBatch(query1);
			st.addBatch(query2);
			st.addBatch(query3);
			st.addBatch(query4);
			
			int row[] = st.executeBatch();
			
			System.out.println(Arrays.toString(row));
			System.out.println(row.length + " effected");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			JdbcUtil.closeConnection(con, st);
		}
		
		

	}

}
