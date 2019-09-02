package com.Jdbc.EstablishConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ResourceBundleConnectionMysql {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try
		{
			ResourceBundle rb=ResourceBundle.getBundle("MysqlConnectionInfo");
			String url=rb.getString("url");
			String user=rb.getString("username");
			String pass=rb.getString("password");
			
			con=DriverManager.getConnection(url,user,pass);
			pst=con.prepareStatement("select * from employee");
			
			rs=pst.executeQuery();
			
			
			while(rs.next()){
			System.out.println(rs.getString(1)+"\t"+rs.getString(2));
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			con.close();
		}

	}

}
