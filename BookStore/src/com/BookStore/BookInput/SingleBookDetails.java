package com.BookStore.BookInput;

import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Scanner;

import com.BookStore.Bean.Book;
import com.BookStore.BooksStoreDatabase.BookDatabaseAdd;
import com.BookStore.Home.Home;

public class SingleBookDetails {
	Date dt = new Date();
	SimpleDateFormat simple_date = new SimpleDateFormat("yyyy-MM-dd");

	Scanner input = new Scanner(System.in);
	public void add()
	{
		System.out.println("--------Adding Single Book-------------");
		Book book = new Book();
		System.out.print("\nEnter Name :  ");
		book.setName(input.next());
		System.out.print("\nEnter Price :  ");
		book.setPrice(input.nextFloat());
		System.out.print("\nEnter Category :  ");
		book.setCategory(input.next());
		String date = simple_date.format(dt);
		book.setDate(date.toString());
		
		BookDatabaseAdd book_dao = new BookDatabaseAdd();
		boolean flag = book_dao.addBookDatabase(book);
		
		if(!flag)
		{
			System.out.println("Book Not Added");
			 new SingleBookDetails().add();
		}
		
		System.out.println("\n---------Book Added-----------");
		
	}
}
