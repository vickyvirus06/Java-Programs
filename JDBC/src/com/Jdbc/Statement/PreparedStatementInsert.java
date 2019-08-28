package com.Jdbc.Statement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.Jdbc.Util.JdbcUtil;

public class PreparedStatementInsert {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pst = null;
		int res = 0;
		Scanner input = new Scanner(System.in);
		int id = 0;
		String name = null;
		String city = null;
		try
		{
			System.out.print("\nEnter Id :   ");
			id = input.nextInt();
			System.out.print("\nEnter Name :   ");
			name = input.next();
			System.out.print("\nEnter City :   ");
			city = input.next();
			
			con=JdbcUtil.getMysql();
			String query = "insert into student values(?,?,?)";
			pst = con.prepareStatement(query);
			pst.setInt(1, id);
			pst.setString(2, name);
			pst.setString(3,city);
			
			res = pst.executeUpdate();
			input.close();
			System.out.println();
			if(res>0)
			{
				System.out.println(res + " records Effected");
			}
			else
			{
				System.out.println("DB not effected");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		JdbcUtil.closeConnection(con, pst);
	}

}
