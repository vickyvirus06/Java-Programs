package com.corejava.Thread;

public class PrintTableThread {

	public static void main(String[] args) {
		PrintTable p = new PrintTable();
		A_Thread th1 = new A_Thread(p,7);
		B_Thread th2 = new B_Thread(p,9);
		
		th1.start();
		th2.start();

	}

}

class PrintTable
{
	synchronized void printtable(int num)
	{
		for (int i = 1; i <= 10; i++) {
			System.out.println(num+" X  "+i+" = "+(num*i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class A_Thread extends Thread
{
	PrintTable print;
	int num;
	A_Thread(PrintTable print,int num)
	{
		this.print=print;
		this.num=num;
	}
	
	@Override
	public void run() {
		print.printtable(num);
	}
}

class B_Thread extends Thread
{
	PrintTable print;
	int num;
	B_Thread(PrintTable print,int num)
	{
		this.print=print;
		this.num=num;
	}
	
	@Override
	public void run() {
		print.printtable(num);
	}
}