package com.corejava.Thread;

public class GarbageCollectorThread {

	public static void main(String[] args) {
		System.out.println("Id"+"\t"+"Name"+"\t\t"+"Group\n");
		Thread th = Thread.currentThread();
		ThreadGroup tg= th.getThreadGroup();
		for(int i =0;i<5;i++)
		{
			System.out.println(th.getId()+"\t"+th.getName()+"\t"+tg.getName());
		}
		
		new GarbageCollectorThread();
		System.gc();
	}
	
	@Override
	protected void finalize() throws Throwable {
	
		Thread th = Thread.currentThread();
		ThreadGroup tg= th.getThreadGroup();
		for(int i =0;i<5;i++)
		{
			System.out.println(th.getId()+"\t"+th.getName()+"\t"+tg.getName());
		}
	}
}


