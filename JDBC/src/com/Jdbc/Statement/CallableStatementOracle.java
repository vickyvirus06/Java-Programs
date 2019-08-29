package com.Jdbc.Statement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

import com.Jdbc.Util.JdbcUtil;

public class CallableStatementOracle {

	public static void main(String[] args) {
		Connection con = null;
		CallableStatement cs = null;
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","vicky","virus");
			/*con= JdbcUtil.getOracle();*/
			cs= con.prepareCall("call updateSalary(?,?,?)");
			cs.setInt(1, 3);
			cs.registerOutParameter(2, Types.VARCHAR);
			cs.setFloat(3, 8000);
			
			cs.executeUpdate();
			String name = cs.getString(2);
			System.out.println(name);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}

	}

}
