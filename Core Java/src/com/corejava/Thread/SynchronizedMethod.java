package com.corejava.Thread;

public class SynchronizedMethod {

	public static void main(String[] args) {
		Method method = new Method();
		Method method1 = new Method();
		/*	A a = new A(method);
		A a1 = new A(method);
		A a2 = new A(method1)
		a.start();
		a1.start();
		a2.start();
		
		*/
		
/*		B b = new B(method);
		B b1 = new B(method);
		B b2 = new B(method2);
		b.start();
		b1.start();
		b2.start();
*/
	/*	C c = new C(method);
		C c1 = new C(method);
		c.start();
		c1.start();*/
		
		D d = new D(method);
		D d1 = new D(method);
		d.start();
		d1.start();
	}

}

class Method
{
	void m1()
	{
		Thread th = Thread.currentThread();
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("m1 ()--- "+ th.getName());
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	synchronized void m2()
	{
		Thread th = Thread.currentThread();
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("m2 ()--- "+ th.getName());
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	static void m3()
	{
		Thread th = Thread.currentThread();
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("m3 ()--- "+ th.getName());
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	synchronized static void m4()
	{
		Thread th = Thread.currentThread();
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("m4 ()--- "+ th.getName());
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}

class A extends Thread
{
	Method method;
	
	
	A(Method method)
	{
		this.method=method;
		
	}
	
	@Override
	public void run() {
		method.m1();
	}
}

class B extends Thread
{
	Method method;
	
	
	B(Method method)
	{
		this.method=method;
		
	}
	
	@Override
	public void run() {
		method.m2();
	}
}

class C extends Thread
{
	Method method;
	
	
	C(Method method)
	{
		this.method=method;
		
	}
	
	@Override
	public void run() {
		Method.m3();
	}
}

class D extends Thread
{
	Method method;
	
	
	D(Method method)
	{
		this.method=method;
		
	}
	
	@Override
	public void run() {
		Method.m4();
	}
}