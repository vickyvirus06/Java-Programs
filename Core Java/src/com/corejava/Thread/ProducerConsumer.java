package com.corejava.Thread;

public class ProducerConsumer {

	public static void main(String[] args) {
		Stack st = new Stack();
		PushThread push = new PushThread(st);
		PopThread pop = new PopThread(st);

	}

}

class Stack
{
	int x;
	boolean flag=false;
	synchronized public void push(int x)
	{
		Thread th=Thread.currentThread();
		if(!flag)
		{
			System.out.println(th.getName()+" has pushed " + x);
			this.x=x;
			flag=true;
			notify();
			
		}
		
		else
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	synchronized public void pop()
	{
		Thread th = Thread.currentThread();
		if(flag)
		{
			System.out.println(th.getName() + " has poped " + x);
			flag=false;
			notify();
			
		}
		else
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

class PushThread extends Thread
{
	Stack st;
	PushThread(Stack st)
	{
		this.st=st;
		this.start();
	}
	
	public void run()
	{
		
		for (int i = 1; i <= 5; i++) {
			st.push(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}

class PopThread extends Thread
{
	Stack st;
	
	PopThread(Stack st)
	{
		this.st=st;
		this.start();
	}
	
	public void run()
	{
		
		for (int i = 1; i <= 5; i++) {
			st.pop();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
}