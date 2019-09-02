package com.BookStore.BookInput;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

import com.BookStore.Bean.Book;
import com.BookStore.BooksStoreDatabase.BookDatabaseAdd;

public class MultipleBooksDetails {
	
	public void addBooks()
	{
		try
		{
			String details = "";
			String details_space[] = null;
			ArrayList<Book> al = new ArrayList<Book>();
			File file = new File("/home/vicky/Desktop/Books.txt");
			
			FileInputStream fis = new FileInputStream(file);
			int data=0;
			while ((data=fis.read())>-1) {
				
				details = details + (char)data;
			}
			String book_new[] = details.split("\n");
			for (int i = 0; i < book_new.length; i++) {
				details_space = book_new[i].split(" ");
					Book book = new Book();
					book.setName(details_space[0]);
					book.setPrice(Float.valueOf(details_space[1]));
					book.setCategory(details_space[2]);
					book.setDate(details_space[3]);
					al.add(book);	
			}
			
			
			fis.close();
			BookDatabaseAdd book_multiple = new BookDatabaseAdd();
			book_multiple.addMultipleBookDatabase(al);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
