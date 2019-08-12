package com.corejava.IO;

import java.io.DataInputStream;
import java.io.IOException;

public class DataInputStreamTest {

	public static void main(String[] args) throws IOException {
		DataInputStream dis = new DataInputStream(System.in);
		System.out.println("Enter name");
		String name = dis.readLine();
		System.out.println("Enter number");
		String mobileno = dis.readLine();
		System.out.println(name+"\t"+mobileno);
		

	}

}
