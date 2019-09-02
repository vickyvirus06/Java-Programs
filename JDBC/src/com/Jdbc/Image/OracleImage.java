package com.Jdbc.Image;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.Jdbc.Util.JdbcUtil;

public class OracleImage {

	public static void main(String[] args) throws SQLException, IOException {

		Connection con = null;
		PreparedStatement pst = null;
		File file = null;
		FileInputStream fis = null;
		try
		{
			con = JdbcUtil.getOracle();
			String query = "Insert into test_image values(?,?)";
			pst = con.prepareStatement(query);
			pst.setInt(1, 101);
			file = new File("/home/vicky/Pictures/vicky.jpg");
			fis=new FileInputStream(file);
			pst.setBinaryStream(2, fis);
			pst.execute();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			con.close();
			pst.close();
		}
		finally
		{
			con.close();
			pst.close();
			fis.close();
			
		}

	}

}
