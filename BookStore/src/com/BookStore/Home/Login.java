package com.BookStore.Home;

import java.util.Scanner;


import com.BookStore.Bean.Admin;
import com.BookStore.BooksStoreDatabase.UserDatabase;


public class Login {
	String username = null;
	String password = null;
	Scanner input = new Scanner(System.in);
	Login login = null;
	boolean flag = false;
	public Login()
	{
		System.out.println("\n-------------Login-------------------");
		Admin admin = new Admin();
		System.out.print("\nEnter Username  :    ");
		admin.setUsername(input.next());
		System.out.print("\nEnter Password  :    ");
		
		admin.setPassword(input.next());
		
		System.out.println();
			
			UserDatabase user = new UserDatabase();
			flag = user.verifyUser(admin);
		
		if(!flag)
		{
			login = new Login();
		}
		else if(flag)
		{
			new Home().getHome();
		}
		
	}
}
