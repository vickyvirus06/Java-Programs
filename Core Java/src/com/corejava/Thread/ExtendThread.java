package com.corejava.Thread;

public class ExtendThread {

	public static void main(String[] args) {
		System.out.println("Id"+"\t"+"Name"+"\t\t"+"Group\n");
		AThread at = new AThread();
		at.setName("Thread-A");
		BThread bt = new BThread();
		bt.setName("Thread-B");
		
		at.start();
		bt.start();

	}

}

class AThread extends Thread
{
	
	@Override
	public void run() {
		
		Thread th = Thread.currentThread();
		ThreadGroup tg= th.getThreadGroup();
		for(int i=0;i<5;i++)
		{
			System.out.println(th.getId()+"\t"+th.getName()+"\t"+tg.getName());
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class BThread extends Thread
{
	
	@Override
	public void run() {
		Thread th = Thread.currentThread();
		ThreadGroup tg= th.getThreadGroup();
		for(int i=0;i<5;i++)
		{
			System.out.println(th.getId()+"\t"+th.getName()+"\t"+tg.getName());
			try {
				Thread.sleep(5000);
		
			}catch(Exception e)
			{
				
			}
			}
		}
}