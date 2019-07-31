package com.corejava.Thread;

public class ThreadStack {
	
	public static void main(String[] args) {
	
		TestThread test= new TestThread();
		
		Thread th2 = Thread.currentThread();
		for(int i=0;i<5;i++)
		{
			System.out.println(th2.getName()+"\t"+i);
			
			try {
				Thread.sleep(1000);
				if(i==1)
				{
					int c=10/0;
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}

class TestThread implements Runnable
{
	TestThread()
	{
		Thread th1 = new Thread(this);
		th1.start();
	}
	
	public void run()
	{
		Thread th = Thread.currentThread();
		for(int i=0;i<5;i++)
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