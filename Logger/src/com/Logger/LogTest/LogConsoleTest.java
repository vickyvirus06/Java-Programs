package com.Logger.LogTest;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.Logger.Calculator.Calculator;

public class LogConsoleTest {
	
	static {
		
		PropertyConfigurator.configure("src//log4j.properties");
	}
	
	static Logger log = Logger.getLogger(LogConsoleTest.class);
	public static void main(String[] args) {
		
		log.info("Calculator Object Created  ");
		Calculator calc = new Calculator();
		
		log.debug("Variable a and b are init ");
		int a=10;
		int b =20;
		
		log.info("Add Method Called ");
		int res = calc.add(a, b);
		
		log.info("Result Printing");
		System.out.println("Result is :  " + res);
		
		
		
		System.out.println("=================================");
		log.info("Now in Pattern Layout \n");
		
		LogPatternConsoleTest.showPatternLog();
		
		log.info("Now Saving Details to file");
		
		LogFileTest.saveToLog();
		
		
		LogHtmlTest.saveToHTMLLog();
	}
}
