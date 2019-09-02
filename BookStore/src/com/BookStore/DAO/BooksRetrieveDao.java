package com.BookStore.DAO;

import java.util.ArrayList;

import com.BookStore.Bean.Book;

public interface BooksRetrieveDao {

	ArrayList<Book> allBooks();
	ArrayList<Book> categoryBooks(String nm);
	ArrayList<Book> priceBooks(float amt);
}
