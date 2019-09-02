package com.BookStore.BooksStoreDatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.BookStore.Bean.Book;
import com.BookStore.DAO.BooksRetrieveDao;
import com.BookStore.Util.JdbcUtil;

public class BookDatabaseRetrieve implements BooksRetrieveDao{
	Connection con = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	Book book = null;
	ArrayList<Book> al = null;
	@Override
	public ArrayList<Book> allBooks() {
		al = new ArrayList<Book>();
		try
		{
			
			con = JdbcUtil.getMysql();
			String query = "Select * from books";
			pst = con.prepareStatement(query);
			rs = pst.executeQuery();
			while(rs.next())
			{
				book = new Book();
				book.setId(rs.getString(1));
				book.setName(rs.getString(2));
				book.setPrice(rs.getFloat(3));
				book.setCategory(rs.getString(4));
				book.setDate(rs.getString(5));
				al.add(book);
				
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
		return al;
	}
	
	public ArrayList<Book> categoryBooks(String nm) {
		String name = nm;
		al = new ArrayList<Book>();
		try
		{
			
			con = JdbcUtil.getMysql();
			String query = "Select * from books where category = ? ";
			pst = con.prepareStatement(query);
			pst.setString(1,name);
			rs = pst.executeQuery();
			while(rs.next())
			{
				book = new Book();
				book.setId(rs.getString(1));
				book.setName(rs.getString(2));
				book.setPrice(rs.getFloat(3));
				book.setCategory(rs.getString(4));
				book.setDate(rs.getString(5));
				al.add(book);
				
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
		return al;
	}
	
	public ArrayList<Book> priceBooks(float amt) {
		float amount = amt;
		al = new ArrayList<Book>();
		try
		{
			
			con = JdbcUtil.getMysql();
			String query = "Select * from books where price <= ? ";
			pst = con.prepareStatement(query);
			pst.setFloat(1,amount);
			rs = pst.executeQuery();
			while(rs.next())
			{
				book = new Book();
				book.setId(rs.getString(1));
				book.setName(rs.getString(2));
				book.setPrice(rs.getFloat(3));
				book.setCategory(rs.getString(4));
				book.setDate(rs.getString(5));
				al.add(book);
				
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
		return al;
	}
	

}
