package com.corejava.IO;

import java.io.File;
import java.io.FileFilter;

public class FileClass {

	public static void main(String[] args) {
		File far[] = File.listRoots();
		
		for (int i = 0; i < far.length; i++) {
			System.out.println(far[i]+"\t"+far[i].getTotalSpace()/1024/1024/1024+ "\t"+far[i].getUsableSpace()/1024/1024/1024);
		}
		
		System.out.println("=======================");
		File f1 = new File("/home/vicky");
		File far1[]=f1.listFiles();
		
		for (int i = 0; i < far1.length; i++) {
			System.out.println(far1[i].getName()+"\t"+far1[i].isDirectory());
		}
		
		System.out.println("=============================");
		File far2[] = f1.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				
				return false;
			}
		});
		
		System.out.println("=================================");
		MyFileFilter filefilter = new MyFileFilter("txt");
		File far23[] = f1.listFiles(new MyFileFilter("txt"));
	
		for (int i = 0; i < far23.length; i++) {
			System.out.println(far23[i].getName());
		}
	}

}

class MyFileFilter implements FileFilter
{
	String ext;
	MyFileFilter(String ext)
	{
		this.ext=ext;
	}
	@Override
	public boolean accept(File pathname) {
		
		return ext.endsWith(ext);
	}
	
}