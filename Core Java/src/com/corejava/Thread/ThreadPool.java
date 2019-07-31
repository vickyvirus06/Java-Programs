package com.corejava.Thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {

	public static void main(String[] args) {
		
		MyThread th = new MyThread();
		ExecutorService ser = Executors.newFixedThreadPool(2);
		for(int i=0;i<4;i++)
		{
			ser.execute(th);
		}

	}

}

class MyThread extends Thread
{
	Thread th = Thread.currentThread();
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
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