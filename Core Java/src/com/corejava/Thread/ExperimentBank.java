package com.corejava.Thread;

public class ExperimentBank {

	public static void main(String[] args) {
		Accounts acc = new Accounts();
		WithdrawThread th1 = new WithdrawThread(acc,3000);
		DepositThread th2 = new DepositThread(acc,1000);
		th1.start();
		th2.start();
	}

}

class Accounts
{
	int bal=2000;
	synchronized void withdraw(int amt)
	{
		if(amt<=bal)
		{
			System.out.println("Current Balance is "+bal);
			bal=bal-amt;
			System.out.println("Amount to withdraw "+amt);
			System.out.println("Balance : " +bal);
			
		}
		else
		{
			System.out.println("Insufficient funds");
		}
		
		
		
	}
	
	synchronized void deposit(int amt)
	{
		System.out.println("Current Balance is "+bal);
		bal=bal+amt;
		System.out.println("Amount to deposit "+amt);
		System.out.println("Balance : " +bal);
		
		
	}
}

class WithdrawThread extends Thread
{
	
	
	
	Accounts acc;
	int amt;
	WithdrawThread(Accounts acc,int amt)
	{
		this.acc=acc;
		this.amt=amt;
		
	}
	
	@Override
	public void run() {
		acc.withdraw(amt);
	}
	
	
}

class DepositThread extends Thread
{
	Accounts acc;
	int amt;
	DepositThread(Accounts acc,int amt)
	{
		this.acc=acc;
		this.amt=amt;
		
	}
	
	@Override
	public void run() {
		acc.deposit(amt);
	}
	
	
}