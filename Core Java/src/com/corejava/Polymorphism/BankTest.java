package com.corejava.Polymorphism;

import java.util.Scanner;

public class BankTest {

	public static void main(String[] args) {
		System.out.println("------------Bank");
		Bank bank = new Bank();
		bank.roi();
		System.out.println("\n-----------Sbi");
		Bank bank1 = new Sbi();
		bank1.roi();
		System.out.println("\n-----------ICICI");
		Bank bank2 = new ICICI();
		bank1.roi();
		
		Scanner input = new Scanner(System.in);
		System.out.print("\n\n Which bank intrest you want to know   :   ");
		String name = input.next();
		if(name.toLowerCase().equals("bank"))
		{
			show(bank);
		}
		else if(name.toLowerCase().equals("sbi"))
		{
			show(bank1);
		}
		else if(name.toLowerCase().equals("icici"))
		{
			show(bank2);
		}
	}
	
	static void show(Bank bank)
	{
		bank.roi();
	}

}

class Bank
{
	void roi()
	{
		int roi=9;
		System.out.println("Rate of Intrest : " + roi + "%");
	}
}

class Sbi extends Bank
{
	void roi()
	{
		int roi=10;
		System.out.println("Rate of Intrest : " + roi + "%");
	}
}

class ICICI extends Bank
{
	void roi()
	{
		int roi=11;
		System.out.println("Rate of Intrest : " + roi + "%");
	}
}
