package com.BookStore.Home;

import java.util.Scanner;


import com.BookStore.Bean.Admin;
import com.BookStore.BooksStoreDatabase.UserDatabase;
import com.BookStore.Main.BookStoreMain;

public class Register {

	String name = null;
	String city = null;
	String mobile_no = null;
	String username = null;
	String password = null;
	Scanner input = new Scanner(System.in);
	Register register = null;
	boolean flag = false;
	public Register()
	{
		System.out.println("\n--------------Register--------------------");
		Admin admin = new Admin();
		System.out.print("\nEnter Name  :    ");
		admin.setName(input.next());
		System.out.print("\nEnter Mobile No :    ");
		admin.setMobile_no(input.next());
		System.out.print("\nEnter City :    ");
		admin.setCity(input.next());
		System.out.print("\nEnter Username  :    ");
		admin.setUsername(input.next());
		System.out.print("\nEnter Password  :    ");
		admin.setPassword(input.next());
		System.out.println();
		
		
		
			UserDatabase user = new UserDatabase();
			flag = user.addUser(admin);
		
		
		if(flag)
		{
			BookStoreMain.admin();
			
			
		}
		
		
		
		
}
}