package com.Jdbc.ResultSet;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.Jdbc.Util.JdbcUtil;

public class ResultSetExploring {

	public static void main(String[] args) {
		
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		
		try
		{
			con = JdbcUtil.getOracle();
			String query = "Select id,name,salary from employee";
			st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			rs = st.executeQuery(query);
			
			System.out.println("Forward Order");
			while(rs.next())
			{
				System.out.println(rs.getInt(1) +"\t" +rs.getString(2)+"\t"+rs.getString(3));
			}
			
			/*System.out.println("\nNow in reverse Order\n");
			while(rs.previous())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
			}
		*/	
			
			/*rs.absolute(2);
			
			rs.deleteRow();
			System.out.println("Row Deleted ");
			*/
			/*rs.last();
			rs.moveToInsertRow();
			rs.updateInt(1, 5);
			rs.updateString(2, "brian");
			rs.updateFloat(3, 34000);
			
			rs.insertRow();
			System.out.println("Row inserted  ");
			*/
			
			
			for(int i =1;i<=7;i++)
			{
				
				rs.absolute(i);
				rs.updateInt(1, i);
				rs.updateRow();
				System.out.println("Rows Updated");
			}
			
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
