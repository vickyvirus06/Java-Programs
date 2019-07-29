package com.corejava.Thread;

public class MainThread {

	public static void main(String[] args) {
		System.out.println("Id"+"\t"+"Name"+"\t\t"+"Group\n");
		Thread th = Thread.currentThread();
		ThreadGroup tg= th.getThreadGroup();
		System.out.println(th.getId()+"\t"+th.getName()+"\t"+tg.getName());

	}

}
