package com.corejava.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class CustomAnnotation {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		SmartPhone smart = new SmartPhone();
		MyAnnotationMultipleValue annon = smart.getClass().getAnnotation(MyAnnotationMultipleValue.class);
		
		System.out.println(annon.version());
		System.out.println(annon.os());
		System.out.println("============================");
		MyAnnotationMultipleValue annon1 = smart.getClass().getMethod("samsung").getAnnotation(MyAnnotationMultipleValue.class);

		System.out.println(annon1.version());
		System.out.println(annon1.os());

	}

}

@MyAnnotationMultipleValue(os="android", version=6)
class SmartPhone
{
	@MyAnnotationMultipleValue(os="android", version=8)
	public void samsung()
	{
		
	}
}


@interface MyAnnotationMarker
{
	
}

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
