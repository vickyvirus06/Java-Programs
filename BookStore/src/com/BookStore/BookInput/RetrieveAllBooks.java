package com.BookStore.BookInput;

import java.util.ArrayList;

import com.BookStore.Bean.Book;
import com.BookStore.BooksStoreDatabase.BookDatabaseRetrieve;

public class RetrieveAllBooks {
	
	BookDatabaseRetrieve book_database_retrieve = null;
	public void getAllBooks()
	{
		 book_database_retrieve = new BookDatabaseRetrieve();
		 ArrayList<Book> al_book = book_database_retrieve.allBooks();
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
