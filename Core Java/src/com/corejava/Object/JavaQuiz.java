package com.corejava.Object;

import java.util.Scanner;

public class JavaQuiz {

	public static void main(String[] args) {
		int choice =0;
		int[] answers = {3,4,1,4,1,4}; 
		Scanner input = new Scanner(System.in);
		JavaQuizTest test = new JavaQuizTest(input);
		
		
		
		
		while(choice!=4)
		{
			System.out.println("Welcome to Vicky Exams ");
			System.out.println("1 Enter Exam ");
			System.out.println("2 Check All Right Answers ");
			System.out.println("3 Check Your Score  ");
			System.out.println("4 Exit ");
			System.out.print("\n\n Menu Choice :   ");
			choice = input.nextInt();	
			System.out.println();
			switch(choice)
			{
				case 1 :  test.startExam(input);
						  break;
						  
				case 2 :  for(int i =0;i<answers.length;i++)
							{
								System.out.println("Answer for " + i + "   =   " + answers[i]);
					
								}
							System.out.println("\n\n");
							break;
			 
				case 3 :	test.showResults(answers);
							break;
			    
				case 4 : System.out.println("Thanks For Using");
							choice=4;
						 	
						 break;
			}
		}
		
		
}
}
class JavaQuizTest
{
	String name;
	int count;
	int answer[]= new int[6];
	
	
	JavaQuizTest(Scanner input)
	{
		System.out.println();
		System.out.print("Enter your Name  :  ");
		name = input.next();
		System.out.println("\n\n");
		
	}
	
	void startExam(Scanner input)
	{
		System.out.println("How many type of primitive data types are there in java  ");
		System.out.println("1.  4");
		System.out.println("2.  6");
		System.out.println("3.  8");
		System.out.println("4.  2");
		System.out.print("\n Enter your choice   :   ");
		answer[0]=input.nextInt();
		System.out.println();
		
		
		System.out.println("How many types of blocks are there in Java ");
		System.out.println("1.  1");
		System.out.println("2.  2");
		System.out.println("3.  4");
		System.out.println("4.  3");
		System.out.print("\n\n Enter your choice   :   ");
		answer[1]=input.nextInt();
		System.out.println();
		
		System.out.println("Array Index Starts from ? ");
		System.out.println("1.  0");
		System.out.println("2.  2");
		System.out.println("3.  1");
		System.out.print("\n\n Enter your choice   :   ");
		answer[2]=input.nextInt();
		System.out.println();
		
		System.out.println("What Type of return Type Void has  ");
		System.out.println("1.  String");
		System.out.println("2.  Int");
		System.out.println("3.  All ");
		System.out.println("4.  None");
		System.out.print("\n\n Enter your choice   :   ");
		answer[3]=input.nextInt();
		System.out.println();
		
		System.out.println("How many public Class can we create in single java file  ");
		System.out.println("1.  1");
		System.out.println("2.  2");
		System.out.println("3.  many");
		System.out.println("4.  40000");
		System.out.print("\n\n Enter your choice   :   ");
		answer[4]=input.nextInt();
		System.out.println();
		System.out.println("\n");
		
		System.out.println("How to type cast int into byte e.g int a = 5  ");
		System.out.println("1.  (int) a");
		System.out.println("2.  (a) int ");
		System.out.println("3.  byte (a) ");
		System.out.println("4.  (byte) a ");
		System.out.print("\n\n Enter your choice   :   ");
		answer[5]=input.nextInt();
		System.out.println();
		System.out.println("\n");
		
		
		
	}
	
	
	void showResults(int[] answers)
	{
		for(int i =0;i<answers.length;i++)
		{
			if(answer[i]==answers[i])
			{
				count++;
			}
		}
		System.out.println();
		System.out.println("Name   : " + name);
		System.out.println("You have Given " + count + "  Right Answers ");
		if(count>=3)
		{ 
			System.out.println("You have Passed  ");
			
		}
		else
		{
			System.out.println("Study Hard Now");
		}
		System.out.println("\n\n");
		
		
	}
	
	
}
