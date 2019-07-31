package com.corejava.Thread;

public class DeadLock {

	public static void main(String[] args) {
		Hello h1 = new Hello();
		
		
		T1 th1 = new T1(h1,"A Thread");
		T2 th2 = new T2(h1,"B Thread");
		th2.start();
		th1.start();

	}

}


class Hello
{
	String resource1 = "Resource-1";
	String resource2 = "Resource-2";
	
	void m1(){
		Thread th=Thread.currentThread();
		synchronized (resource1) {
			System.out.println(th.getName()+" locked ");
			System.out.println("waiting for "+resource1);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
			synchronized (resource2) {
				System.out.println(th.getName()+" Released "+resource2);
			}
		}
	}
	
	void m2(){
		Thread th=Thread.currentThread();
		synchronized (resource2) {
			System.out.println(th.getName()+" locked ");
			System.out.println("waiting for "+resource2);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
			synchronized (resource1) {
				System.out.println(th.getName()+" Released ");
			}
		}
	}
	
}

class T1 extends Thread
{
	String name;
	Hello h1;
	
	T1(Hello h1,String name)
	{
		super(name);
		this.h1=h1;
	}
	
	@Override
	public void run() {
		h1.m1();
	}
}

class T2 extends Thread
{
	String name;
	Hello h1;
	
	T2(Hello h1,String name)
	{
		super(name);
		this.h1=h1;
		
	}
	
	@Override
	public void run() {
	h1.m2();
	}
}