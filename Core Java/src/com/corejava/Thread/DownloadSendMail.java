package com.corejava.Thread;

public class DownloadSendMail {

	public static void main(String[] args) {
		
		System.out.println("Id"+"\t"+"Name"+"\t\t"+"Group\n");
		Download download = new Download();
		SendMail send = new SendMail();
		
		download.start();
		send.start();

	}

}

class MyApp
{
	public void download()
	{
	
		Thread th = Thread.currentThread();
		th.setName("Download");
		ThreadGroup tg= th.getThreadGroup();
		for(int i=0;i<5;i++)
		{
			System.out.println(th.getId()+"\t"+th.getName()+"\t"+tg.getName());
			try {
				Thread.sleep(1000);
		
			}catch(Exception e)
			{
				
			}
			}
		}
	
	public void sendMail()
	{
	
		Thread th = Thread.currentThread();
		th.setName("SendMail");
		ThreadGroup tg= th.getThreadGroup();
		for(int i=0;i<5;i++)
		{
			System.out.println(th.getId()+"\t"+th.getName()+"\t"+tg.getName());
			try {
				Thread.sleep(1000);
		
			}catch(Exception e)
			{
				
			}
			}
		}
	
}


class Download extends Thread
{
	
	@Override
	public void run() {
		new MyApp().download();
	}
	
}

class SendMail extends Thread
{
	
	@Override
	public void run() {
		new MyApp().sendMail();
	}
	
}