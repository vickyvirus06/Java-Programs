package com.Logger.LogTest;

import java.io.IOException;

import javax.swing.text.html.HTML;

import org.apache.log4j.Appender;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

import com.Logger.Calculator.Calculator;

public class LogHtmlTest {

static Logger log = Logger.getLogger(LogFileTest.class);
	
	static HTMLLayout lay = null;
	static{
		lay = new HTMLLayout();
		
		Appender app;
		try {
			app = new FileAppender(lay,"F:\\Logs\\Calc.html");
			BasicConfigurator.configure(app);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	 
	
	
	static public void saveToHTMLLog()
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
