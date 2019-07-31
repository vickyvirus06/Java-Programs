package com.corejava.Thread;

public class JoinMethod {

	public static void main(String[] args) throws InterruptedException {
		Thread1 th1 = new Thread1("A Thread");
		Thread2 th2 = new Thread2("B Thread");
		Thread3 th3 = new Thread3("C Thread");
		Thread4 th4 = new Thread4("D Thread");
		
		
		th1.start();
		th1.join();
		th2.start();
		th2.join();
		th3.start();
		th3.join();
		th4.start();
		
		

	}

}

class Thread1 extends Thread
{
	
	Thread1(String name)
	{
		super(name);
	}
	public void run()
	{
		Thread th = Thread.currentThread();
		for(int i=1;i<=5;i++)
		{
			System.out.println(th.getName()+"\t"+i);
			
			try {
				Thread.sleep(1000);
		
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Thread2 extends Thread
{
	Thread2(String name)
	{
		super(name);
	}
	public void run()
	{
		Thread th = Thread.currentThread();
		for (int i = 1; i <= 5; i++) {
			
			System.out.println(th.getName()+"\t"+i);
			
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
				
			}
			
		}
	}
}

class Thread3 extends Thread
{
	Thread3(String name)
	{
		super(name);
	}
	public void run()
	{
		Thread th = Thread.currentThread();
		for (int i = 1; i <= 5; i++) {
			
			System.out.println(th.getName()+"\t"+i);
			
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}

class Thread4 extends Thread
{
	Thread4(String name)
	{
		super(name);
	}
	
	public void run()
	{
		Thread th = Thread.currentThread();
		for(int i=1;i<=5;i++)
		{
			System.out.println(th.getName()+"\t"+i);
			
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}