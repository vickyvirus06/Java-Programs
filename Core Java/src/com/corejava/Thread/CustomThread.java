package com.corejava.Thread;

public class CustomThread {

	public static void main(String[] args) {
		
		System.out.println("Priority"+"\t"+"Id"+"\t"+"Name"+"\t\t"+"Group\n");
		//"First Way using setName ------\n"
		Custom t1 = new Custom();
		t1.setName("Thread 1");
		t1.start();
		
		//"Second way passing in constructor"
		Custom t2 = new Custom("Thread 2");
		t2.start();
		
		//SetPriority 
		
		t1.setPriority(1);
		t2.setPriority(9);
		
		//setGroup manually
		ThreadGroup tg = new ThreadGroup("vicky");
		Custom t3 = new Custom(tg,"Thread 3");
		t3.start();
		
		
		
		

	}

}

class Custom extends Thread
{
	Custom()
	{
		
	}
	
	Custom(String name)
	{
		super(name);
	}
	
	Custom(ThreadGroup tg,String name)
	{
		super(tg,name);
	}
	
	
	@Override
	public void run() {
		Thread th = Thread.currentThread();
		ThreadGroup tg = th.getThreadGroup();
		for (int i = 0; i < 5; i++) {
			
			
			System.out.println(th.getPriority()+"\t\t"+th.getId()+"\t"+th.getName()+"\t"+tg.getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
	}
	
	
}
