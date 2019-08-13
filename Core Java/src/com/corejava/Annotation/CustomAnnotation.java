package com.corejava.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class CustomAnnotation {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
		SmartPhone smart = new SmartPhone();
		MyAnnotationSingleValue annon = smart.getClass().getAnnotation(MyAnnotationSingleValue.class);
		
		System.out.println("My Pc O S ");
		System.out.println(annon.os());
		
		System.out.println("============================");
		
		smart.samsung();
		MyAnnotationMultipleValue annon1 = smart.getClass().getMethod("samsung").getAnnotation(MyAnnotationMultipleValue.class);

		
		System.out.println(annon1.os()+"   "  +annon1.version());
		
		
		System.out.println("======================================");
		
		smart.lava();
		MyAnnotationMultipleValue annon2  = smart.getClass().getMethod("lava").getAnnotation(MyAnnotationMultipleValue.class);
		System.out.println(annon2.os()+"   "+annon2.version());
		
		System.out.println("========================================");
		
		smart.lumia();
		
		MyAnnotationMultipleValue annon3 = smart.getClass().getMethod("lumia").getAnnotation(MyAnnotationMultipleValue.class);
		System.out.println(annon3.os()+"    "+annon3.version());
	}

}
class Smart extends SmartPhone
{
	@MyAnnotationMarker
	public void samsu()
	{
		
	}
}
@MyAnnotationSingleValue(os="linux")
class SmartPhone
{
	@MyAnnotationMultipleValue(os="android", version=8)
	public void samsung()
	{
		System.out.println("This is Samsung Mobile");
	}
	
	@MyAnnotationMultipleValue(os="android", version=6)
	public void lava()
	{
		System.out.println("This is Lava Mobile");
	}
	
	@MyAnnotationMultipleValue(os="windows", version=10)
	public void lumia()
	{
		System.out.println("This is windows powered Lumia");
	}
}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
@interface MyAnnotationMarker
{
	
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotationSingleValue
{
	String os() default "linux";
}

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotationMultipleValue
{
	String os() default "linux";
	int version() default 1;
}
