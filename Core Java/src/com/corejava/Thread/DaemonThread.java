package com.corejava.Thread;

public class DaemonThread {

	public static void main(String[] args) {
		
		Thread th = Thread.currentThread();
		new DaemonThreadTest();
		System.gc();
		
		for(int i=0;i<5;i++)
		{
			System.out.println(th.getName()+"\t"+i);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				
			}
		}
		
		

	}

}

class DaemonThreadTest 
{
	@Override
	protected void finalize() throws Throwable {
		Thread th = Thread.currentThread();
		for(int i=0;i<15;i++)
		{
			System.out.println(th.getName()+"\t"+i);
			
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				
			}
		}
	}
}

