package com.BookStore.Home;

import java.util.Scanner;

import com.BookStore.BookInput.MultipleBooksDetails;
import com.BookStore.BookInput.RetrieveAllBooks;
import com.BookStore.BookInput.RetrieveByCategoryBooks;
import com.BookStore.BookInput.RetrieveByPrice;
import com.BookStore.BookInput.SingleBookDetails;



public class Home {
	int choice =0;
	Scanner input = new Scanner(System.in);
	public void getHome()
	{
		do {
			System.out.println("-----------------Vicky Book Store---------------------");
			System.out.println();
			System.out.println("Add Panel  : ");
			System.out.println("1 Add Book \t 2 Add Multiple Books ");
			System.out.println("\nRetrieve Panel  :");
			System.out.println("3 All Books \t 4 Books By Category \t 5 Books By Price");
			System.out.println("6 Exit");
			System.out.print("\nEnter Your Choice	:		");
			choice = input.nextInt();
			switch(choice)
			{
			case 1 : SingleBookDetails addbook = new SingleBookDetails();
						addbook.add();
						break;
			case 2 : MultipleBooksDetails multi_book = new MultipleBooksDetails();
					 multi_book.addBooks();
					 break;
						
			case 3 : RetrieveAllBooks retrieve_all = new RetrieveAllBooks();
					 retrieve_all.getAllBooks();
					 break;
					 
			case 4 : RetrieveByCategoryBooks retrieve_category = new RetrieveByCategoryBooks();
					 retrieve_category.getBooksCategory();
					 break;
		   
			case 5 : RetrieveByPrice retrieve_price = new RetrieveByPrice();
			 		retrieve_price.getByPrice();
			 		break;
			}
		}while(choice!=6);
		
		System.out.println("\n---------------Thanks For Using Vicky Book Application-------------");
	}
}
