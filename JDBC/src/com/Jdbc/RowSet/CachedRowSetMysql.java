package com.Jdbc.RowSet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.RowSet;

import com.Jdbc.Util.JdbcUtil;
import com.sun.rowset.CachedRowSetImpl;
import com.sun.rowset.JdbcRowSetImpl;

public class CachedRowSetMysql {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		
		RowSet rs=null;
		try {
			rs=new CachedRowSetImpl();
			
			rs.setUrl("jdbc:mysql://localhost:3306/sjt");
			rs.setUsername("vicky");
			rs.setPassword("virus");
			
			rs.setCommand("select * from employee");
			
			rs.execute();
			
			while(rs.next()){
				System.out.println(rs.getString(1)+"\t"+rs.getString(2));
			}
			
			File file=new File("/home/vicky/Documents/vickypoojari.txt");
			if(file==null)
				file.createNewFile();
			FileOutputStream fos=new FileOutputStream(file);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(rs);
			oos.close();
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			
			try {
				
				rs.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
}
