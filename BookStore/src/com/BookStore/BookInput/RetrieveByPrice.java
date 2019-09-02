package com.BookStore.BookInput;

import java.util.ArrayList;
import java.util.Scanner;

import com.BookStore.Bean.Book;
import com.BookStore.BooksStoreDatabase.BookDatabaseRetrieve;

public class RetrieveByPrice {
	Scanner input = new Scanner(System.in);
	public void getByPrice()
	{
		System.out.println();
		System.out.println("------------------Price Filter-------------\n");
		System.out.print("Enter Amount to Filter   :     ");
		float  amount  = input.nextFloat();
		
		BookDatabaseRetrieve book_database = new BookDatabaseRetrieve();
		ArrayList<Book> al_book = book_database.priceBooks(amount);
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
