package com.BookStore.BooksStoreDatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.BookStore.Bean.Book;
import com.BookStore.DAO.BooksAddDao;
import com.BookStore.Util.JdbcUtil;

public class BookDatabaseAdd implements BooksAddDao {
	String id = null;
	Connection con = null;
	PreparedStatement pst = null;
	ResultSet rs =null;
	public boolean addBookDatabase(Book book)
	{
		
		try 
		{
			id = getId();
			
			con=JdbcUtil.getMysql();
			String query = "Insert into books values(?,?,?,?,?)";
			pst = con.prepareStatement(query);
			pst.setString(1, id);
			pst.setString(2, book.getName());
			pst.setFloat(3, book.getPrice());
			pst.setString(4, book.getCategory());
			pst.setString(5, book.getDate());
			int res = pst.executeUpdate();
			if(res>0)
			{
				return true;
			}
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			JdbcUtil.closeConnection(con, pst, rs);
		}
		
		return false;
	}
	
	public String getId()
	{
		String bid = "B-";
		try 
		{
			con=JdbcUtil.getMysql();
			String query = "Select count(id) from books";
			pst = con.prepareStatement(query);
			rs = pst.executeQuery();
			while(rs.next()) {
			
			bid = bid+(rs.getInt(1)+1);
			
			}
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return bid;
	}
	
	public void addMultipleBookDatabase(ArrayList<Book> al)
	{
		int res=0;
		try
		{
			con=JdbcUtil.getMysql();
			
			for (Book book : al) {
				id = getId();
				String query = "Insert into books values(?,?,?,?,?)";
				pst = con.prepareStatement(query);
				pst.setString(1, id);
				pst.setString(2, book.getName());
				pst.setFloat(3, book.getPrice());
				pst.setString(4, book.getCategory());
				pst.setString(5, book.getDate());
				res = pst.executeUpdate();
				
				
			}
			
			if(res>0)
			System.out.println("\n---Books Added Successfully---\n");
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			JdbcUtil.closeConnection(con, pst);
		}
	}

}
