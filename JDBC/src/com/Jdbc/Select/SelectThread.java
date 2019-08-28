package com.Jdbc.Select;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Jdbc.Util.JdbcUtil;


public class SelectThread {

	public static void main(String[] args) {
		Student student = new Student();
		Employee employee = new Employee();
		student.start();
		employee.start();
	}

}

class Student extends Thread
{
	Connection con = null;
	PreparedStatement pst = null;
	ResultSet rs=null;
	{
		
		try {
			con = JdbcUtil.getMysql();
			pst = con.prepareStatement("Select * from student");
			rs = pst.executeQuery();

		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	public void run()
	{
		try {
			while(rs.next())
			{
				System.out.println("Student   :  " +rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
				Thread.sleep(1000);
			}
			con.close();
			pst.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}


class Employee extends Thread
{
	Connection con = null;
	PreparedStatement pst = null;
	ResultSet rs=null;
	{
		
		try {
			con = JdbcUtil.getOracle();
			pst = con.prepareStatement("Select * from employee");
			rs = pst.executeQuery();

		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	public void run() 
	{
		try {
			while(rs.next())
			{
				System.out.println("Employee :  " +rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
				Thread.sleep(1000);
			}
			
			con.close();
			pst.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
