package com.corejava.Thread;

public class SynchronizedBlock {

	public static void main(String[] args) {
		
		Block block = new Block();
		Block block1=new Block();
		ABlock th1 = new ABlock(block,"A Thread");
		BBlock th2 = new BBlock(block,"B Thread");
		/*th1.start();
		th2.start();*/
		
		ABlock th3 = new ABlock(block,"C Thread");
		BBlock th4 = new BBlock(block,"D Thread");
		th3.start();
		th4.start();
		
		
	}

}


class Block
{
	
	void m1(Hai hai)
	{
		Thread th = Thread.currentThread();
		
		
		synchronized(hai.getClass())
		{
		for (int i = 0; i < 5; i++) {
			
			System.out.println(th.getId()+"\t"+th.getName());
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		}
	}
}

class ABlock extends Thread
{
	Block block;
	String name;
	
	ABlock(Block block, String name)
	{
		super(name);
		this.block=block;
	}
	
	@Override
	public void run() {
		Hai hai = new Hai();
		block.m1(hai);
	}
}

class BBlock extends Thread
{
	Block block;
	String name;
	
	BBlock(Block block, String name)
	{
		super(name);
		this.block=block;
	}
	
	@Override
	public void run() {
		
		Hai hai = new Hai();
		block.m1(hai);
	}
}

class Hai 
{
	
}