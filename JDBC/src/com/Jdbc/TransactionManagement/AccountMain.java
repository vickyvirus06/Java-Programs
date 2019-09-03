package com.Jdbc.TransactionManagement;

import java.util.Scanner;

public class AccountMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter account number :  ");
		int source_acc = input.nextInt();
		System.out.print("\nEnter Destination account number   :  ");
		int dest_acc = input.nextInt();
		System.out.print("\nEnter amount   :   ");
		double amt = input.nextDouble();
		
		AccountDatabase acc_database = new AccountDatabase();
		acc_database.transferFund(source_acc, dest_acc, amt);
	}

}
