package com.Jdbc.Image;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Jdbc.Util.JdbcUtil;

public class ImageRetrieve {

	public static void main(String[] args) throws SQLException, IOException {
		Connection con = null;
		PreparedStatement pst = null;
		File file = null;
		FileOutputStream fos = null;
		ResultSet rs = null;
		InputStream is = null;
		byte[] by = new byte[1];
		try
		{
			con = JdbcUtil.getMysql();
			String query = "Select * from test_image";
			file = new File("/home/vicky/Pictures/vicky_poojari.jpg");
			fos=new FileOutputStream(file);
			pst=con.prepareStatement(query);
			rs=pst.executeQuery();
			
			while(rs.next())
			{
				rs.getInt(1);
				is = rs.getBinaryStream(2);
			}
			
			while((is.read(by))>0)
			{
				
				
				fos.write(by);
			}
			System.out.println("Image Retreived");
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			con.close();
			pst.close();
		}
		finally
		{
			con.clearWarnings();
			pst.clearBatch();
			pst.close();
			fos.close();
			is.close();
		}



	}

}
