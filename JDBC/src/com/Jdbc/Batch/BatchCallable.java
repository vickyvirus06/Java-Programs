package com.Jdbc.Batch;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;
import java.util.Arrays;
import java.util.Scanner;

import com.Jdbc.Util.JdbcUtil;

public class BatchCallable {

	public static void main(String[] args) {
		Connection con=null;
		CallableStatement cs = null;
		String query = "call updateSalary(?)";
		
		try
		{
			con = JdbcUtil.getOracle();
			cs = con.prepareCall(query);
			cs.setInt(1, 1);
			cs.addBatch();
			cs.setInt(1, 2);
			cs.addBatch();
			int row[]=cs.executeBatch();
			System.out.println(Arrays.toString(row));
			System.out.println(row.length + "   rows");
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			JdbcUtil.closeConnection(con, cs);
			
			
		}


	}

}
