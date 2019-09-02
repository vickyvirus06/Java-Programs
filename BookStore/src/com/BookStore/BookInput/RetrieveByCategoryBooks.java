package com.BookStore.BookInput;

import java.util.ArrayList;
import java.util.Scanner;

import com.BookStore.Bean.Book;
import com.BookStore.BooksStoreDatabase.BookDatabaseRetrieve;

public class RetrieveByCategoryBooks {
	Scanner input = new Scanner(System.in);
	public void getBooksCategory()
	{
		System.out.println();
		System.out.println("------------------Category Filter-------------\n");
		System.out.print("Enter Which Category Books You Want to Filter   :     ");
		String name = input.next();
		BookDatabaseRetrieve book_database = new BookDatabaseRetrieve();
		ArrayList<Book> al_book = book_database.categoryBooks(name);
		 System.out.println();
		 System.out.println("Id    Name   Price     Category      Date ");
		 for (Book book : al_book) {
			System.out.println("---------------------------------------------------");
			System.out.println(book.getId()+" |  "+book.getName()+" |  "+book.getPrice()+" |  "+book.getCategory()+" |  "+book.getDate());
		}
		 System.out.println("-------------------------------------------------------");
		 System.out.println();
	}

}
