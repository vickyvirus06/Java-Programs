package com.corejava.Thread;

public class WaitNotify {

	public static void main(String[] args) {
		Test test = new Test();
		WaitThread th1 = new WaitThread(test,"A Thread");
		NotifyThread th2= new NotifyThread(test,"B Thread");
		th1.start();
		th2.start();

	}

}

class Test
{
	
	synchronized void m1()
	{
		Thread th = Thread.currentThread();
		for (int i = 0; i < 5; i++) {
			System.out.println(th.getName()+"\t"+th.getId());
			
			try {
				
				wait();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	synchronized void m2()
	{
		
			notify();
	
		

	}
}
class WaitThread extends Thread
{
	Test test;
	String name;
	WaitThread(Test test,String name)
	{
		super(name);
		this.test=test;
		this.name=name;
	}
	
	@Override
	public void run() {
		test.m1();
	}
}


class NotifyThread extends Thread
{
	Test test;
	String name;
	
	NotifyThread(Test test,String name)
	{
		super(name);
		this.test=test;
		this.name=name;
	}
	
	@Override
	public void run() {
		test.m2();
	}
}