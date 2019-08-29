package com.Jdbc.Batch;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Arrays;
import java.util.Scanner;

import com.Jdbc.Util.JdbcUtil;

public class BatchPreparedStatement {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pst = null;
		String choice = "yes";
		Scanner input = new Scanner(System.in);
		try
		{
			con=JdbcUtil.getMysql();
			String query = "Insert into employee values(?,?,?)";
			
			
			pst = con.prepareStatement(query);
			
			do {
				
				System.out.print("\nEnter Name    :  "   );
				String name = input.next();
				System.out.print("\nEnter City    :  ");
				String city = input.next();
				System.out.print("\nEnter Salary Package	:  ");
				float salary = input.nextFloat();
				
				pst.setString(1, name);
				pst.setString(2, city);
				pst.setFloat(3, salary);
				
				pst.addBatch();
				
				System.out.print("\nYou Want to enter more details yes or no    :  " );
				choice = input.next();
			}while(choice.equals("yes"));
			
			
			int  row [] = pst.executeBatch();
			
			System.out.println(Arrays.toString(row));
			System.out.println(row.length + " row effected ");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			JdbcUtil.closeConnection(con, pst);
			input.close();
		}

	}

}
