package com.Jdbc.Statement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

import com.Jdbc.Util.JdbcUtil;

public class CallableUserInput {

	public static void main(String[] args) throws SQLException {
		Connection con=null;
		CallableStatement cs = null;
		Scanner input = new Scanner(System.in);
		String query = "call updateSalary(?,?,?)";
		int id =0;
		String name = null;
		float increment = 0;
		
		System.out.print("\nEnter Id :   ");
		id = input.nextInt();
		System.out.println("\nEnter Salary Hike :  ");
		increment = input.nextFloat();
		try
		{
			con = JdbcUtil.getOracle();
			cs = con.prepareCall(query);
			cs.setInt(1, id);
			cs.registerOutParameter(2, Types.VARCHAR);
			cs.setFloat(3, increment);
			
			name = cs.getString(2);
			System.out.println(name);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			JdbcUtil.closeConnection(con, cs);
			
			input.close();
		}

	}

}
