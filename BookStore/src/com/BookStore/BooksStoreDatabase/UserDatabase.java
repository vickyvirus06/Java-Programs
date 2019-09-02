package com.BookStore.BooksStoreDatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.BookStore.Bean.Admin;
import com.BookStore.Util.JdbcUtil;

public class UserDatabase {
	Connection con = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	
	public boolean verifyUser(Admin admin)
	{
		try
		{
			
			con = JdbcUtil.getMysql();
			String query = "Select * from users where username = ? and password = ?";
			pst = con.prepareStatement(query);
			pst.setString(1, admin.getUsername());
			pst.setString(2, admin.getPassword());
			
			rs =pst.executeQuery();
			
			while(rs.next())
			{
				System.out.println("Login Successfull");
				return true;
			}
			
			System.out.println("Invalid Username or Password");
		}  
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		finally
		{
			JdbcUtil.closeConnection(con, pst, rs);
		}
		return false;
	}
	
	public boolean addUser(Admin admin)
	{
		try
		{
			
			con = JdbcUtil.getMysql();
			String query = "insert into users values(?,?,?,?,?)";
			pst = con.prepareStatement(query);
			pst.setString(1, admin.getName());
			pst.setString(2, admin.getMobile_no());
			pst.setString(3, admin.getCity());
			pst.setString(4, admin.getUsername());
			pst.setString(5, admin.getPassword());
			
			int res =pst.executeUpdate();
			
			if(res>0)
			{
				System.out.println("\nRegister Successfully\n");
				return true;
			}
			
			
		}  
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		finally
		{
			JdbcUtil.closeConnection(con, pst, rs);
		}
		return false;
	}

}
