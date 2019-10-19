package com.Logger.LogTest;

import org.apache.log4j.Appender;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

import com.Logger.Calculator.Calculator;

public class LogPatternConsoleTest {

	static Logger log = Logger.getLogger(LogPatternConsoleTest.class);
	
	static Layout lay = null;
	static{
		lay = new PatternLayout(" '%d' '%c' '%p'  ");
		
		Appender app = new ConsoleAppender();
		BasicConfigurator.configure(app);
	}
	
	 
	
	
	static public void showPatternLog()
	{
		log.info("Calculator Object Created  ");
		Calculator calc = new Calculator();
		
		log.debug("Variable a and b are init ");
		int a=10;
		int b =20;
		
		log.info("Add Method Called ");
		int res = calc.add(a, b);
		
		log.info("Result Printing");
		System.out.println("Result is :  " + res);

	}
	
	
}
