package com.corejava.TimeAndTask;


import java.text.SimpleDateFormat;
import java.util.*;

public class TimeAndTask {

	public static void main(String[] args) {
		
		Timer t = new Timer();
		
		EmailBody body = new EmailBody(t);
		body.message();

	}

}

class EmailBody
{
	Timer t;
	SimpleDateFormat date;
	Scanner input = new Scanner(System.in);
	EmailBody(Timer t)
	{
		this.t=t;
		date = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	}
	
	void message()
	{
		
		System.out.println(date.format(new Date()));
		String message="";
		System.out.println("Do You Want To Use Email Time Scheduler Program ");
		System.out.print("\nType 'Y' for Yes and 'N' for No   :   " );
		String choice = input.next();
		if(choice.equalsIgnoreCase("Y"))
		{
			System.out.print("\nEnter Email id :   ");
			String id = input.next();
			System.out.print("\nEnter Your Message  :    ");
			//input.useDelimiter("\n");
			input.nextLine();
			message = input.nextLine();
			
			System.out.print("\nEnter After How Many mins Want To send  :   ");
			int time = input.nextInt();
			time = (time*1000)*60;
			SendMessage send = new SendMessage(t,id,message);
			t.schedule(send, time);
			input.close();
			
		}
		
		else
		{
			System.out.println("Comeback soon to use");
			input.close();
			t.cancel();
		}
	}
}

class SendMessage extends TimerTask
{
	SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Timer t;
	String message ;
	String id;
	SendMessage(Timer t,String id,String message)
	{
		this.t=t;
		this.id=id;
		this.message=message;
	}

	@Override
	public void run() {
		System.out.println("----------------------------------------------------------");
		System.out.println("\nMessage Sent Successfully   \n"+"\nTo : "+id+"\nMessage is : " + message);
		
		System.out.println("\nSent at : " + date.format(new Date()));
		t.cancel();
		System.exit(0);
		
	}
}