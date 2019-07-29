package com.corejava.Thread;

public class RunnableThread {

	public static void main(String[] args) {
		
		System.out.println("Id"+"\t"+"Name"+"\t\t"+"Group\n");
		ARun a = new ARun();
		BRun b = new BRun();
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(b);
		t1.start();
		t2.start();

	}

}

class ARun implements Runnable
{
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			
		
		Thread th = Thread.currentThread();
		ThreadGroup tg = th.getThreadGroup();
		System.out.println(th.getId()+"\t"+th.getName()+"\t"+tg.getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}

class BRun implements Runnable
{
	public void run() {
		for (int i = 0; i < 5; i++) {
			
		Thread th = Thread.currentThread();
		ThreadGroup tg = th.getThreadGroup();
		System.out.println(th.getId()+"\t"+th.getName()+"\t"+tg.getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}