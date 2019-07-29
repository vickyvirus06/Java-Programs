package com.corejava.Thread;

public class ThreadLifeCycle {

	public static void main(String[] args) {
		Athread th1 = new Athread();
		System.out.println(th1.getState());
		th1.start();
		System.out.println(th1.getState());
		System.out.println(th1.getState());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(th1.getState());
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(th1.getState());
	}

}

class Athread extends Thread
{
	
	@Override
	synchronized public void run() {
		
		Thread th = Thread.currentThread();
		ThreadGroup tg= th.getThreadGroup();
		for(int i=0;i<5;i++)
		{
			System.out.println(th.getId()+"\t"+th.getName()+"\t"+tg.getName());
			try {
				wait(3000);
				//Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
