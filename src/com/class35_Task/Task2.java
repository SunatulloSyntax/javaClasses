package com.class35_Task;

import java.util.*;

public class Task2 {
	public static void main(String[] args) {
		/*Create a map of countries with its capital
		 * Print all keys and values from a country map using for each loop and iterator
		 * Print all values from a country map using for each loop and iterator*/
		Map<String, String> countries = new TreeMap<String, String>();
		countries.put("Tajikistan", "Dushanbe");
		countries.put("Usa", "Washington");
		countries.put("Turkey", "Ankara");
		countries.put("Russia", "Moscow");
		
		Set<String> countries1 = countries.keySet();
		
		for(String c : countries1) {
			System.out.println("The capital city of " + c + " : " + countries.get(c));
//			System.out.println("Name of capitals: " + countries.get(c));
		}
		
		
		System.out.println("---------------------Iterator");
		Iterator<String> countriesIt = countries1.iterator();
		while(countriesIt.hasNext()) {
			String str = countriesIt.next();
			System.out.println("Name of countries: " + str);
			System.out.println("Name of capitals: " + countries.get(str));
		}
		
		System.out.println("------------------------Getting all values");
		
		for(String c : countries1) {
//			System.out.println("Name of countries: " + c);
			System.out.println("Name of capitals: " + countries.get(c));
		}
		
		
		System.out.println("---------------------Iterator");
		Iterator<String> countriesIt1 = countries1.iterator();
		while(countriesIt1.hasNext()) {
			String str = countriesIt1.next();
//			System.out.println("Name of countries: " + str);
			System.out.println("Name of capitals: " + countries.get(str));
		}
		
		
	}
}
