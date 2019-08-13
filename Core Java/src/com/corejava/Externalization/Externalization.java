package com.corejava.Externalization;

import java.io.Externalizable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Externalization {

	public static void main(String[] args) throws Exception{
		File f = new File("/home/vicky/Documents/student3.txt");
		if(!f.exists())
		{
			f.createNewFile();
		}
		
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Student student1 = new Student(101,"vicky","bengaluru");
		oos.writeObject(student1);
		
		
		System.out.println(student1);
		
		System.out.println("----------------------------------");
		
		
		
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Student student2 = (Student)ois.readObject();
		
		System.out.println(student2);
		
		fos.close();
		oos.close();
		fis.close();
		ois.close();     
		
		
		
	}

	
}


class Student implements Externalizable
{

	int sid;
	String sname;
	String scity;
	
	public Student()
	{
		
		
		System.out.println("Student---------");
	}
	
	Student(int sid,String sname,String scity)
	{
		this.sid=sid;
		this.sname=sname;
		this.scity=scity;
		
		Enum e = Enum.North;
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.write(sid);
		out.writeObject(sname);
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		sid = in.read();
		sname=(String) in.readObject();
		
	}
	
	@Override
	public String toString() {
	
		return sid+"\t"+sname+"\t"+scity;
	}
	
}
enum Enum
{
	North;
}