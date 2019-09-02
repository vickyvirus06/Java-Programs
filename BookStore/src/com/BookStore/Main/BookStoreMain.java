package com.BookStore.Main;

import java.util.Scanner;

import com.BookStore.Home.Login;
import com.BookStore.Home.Register;

public class BookStoreMain {

	
	public static void main(String[] args) {
			admin();
			}
	
	
	public static void admin()
	{
		Scanner input = null;
		int choice = 0;
		do
		{
		input = new Scanner(System.in);
		System.out.println("-------------Welcome to Vicky Book Store-----------------");
		System.out.println("\nAdmin Panel");
		System.out.println("\n 1 Login");
		System.out.println("\n 2 Register");
		System.out.print("\nEnter your Choice 	:		");
		choice = input.nextInt();
		
		if(choice==1)
		{
			
			Login login = new Login();
		}
		else if(choice==2)
		{
			
			Register register = new Register();
		}
		}while(choice!=1 && choice!=2);
		
		input.close();
	}
}
