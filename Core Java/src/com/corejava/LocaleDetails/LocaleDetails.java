package com.corejava.LocaleDetails;

import java.util.Locale;

public class LocaleDetails {

	public static void main(String[] args) {
		Locale loc = Locale.getDefault();
		
		System.out.println("Language :  "+loc.getLanguage());
		System.out.println("Country Code :  "+loc.getCountry());
		System.out.println("Country :  "+loc.getDisplayCountry());
		
		System.out.println("\n==========================\n");
		
		Locale[] l=Locale.getAvailableLocales();
		
		for (int i = 0; i < l.length; i++) {
		
			System.out.println("Language :  "+l[i].getLanguage());
			System.out.println("Country Code :  "+l[i].getCountry());
			System.out.println("Country :  "+l[i].getDisplayCountry());
			
		}
		
		
	}

}
