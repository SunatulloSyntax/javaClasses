package com.class34_Ex;

import java.util.*;

public class Task1 {
	public static void main(String[] args) {
/*Create a Set collection in which you need 
 * to add names of the countries. In this set 
 * we want all objects to be sorted in 
 * alphabetical order.
 *  Using 2 different ways retrieve all elements from set.*/
		
		Set<String> countries = new TreeSet<>();
		countries.add("Tajikistan");
		countries.add("USA");
		countries.add("Turkey");
		countries.add("Afganistan");
		countries.add("China");
		
		for(String namesOfCountries : countries) {
			System.out.println(namesOfCountries);
		}
		
		System.out.println("---Using Iterator");
		Iterator<String> namesOfCountries1 = countries.iterator();
		while(namesOfCountries1.hasNext()) {
			String n = namesOfCountries1.next();
			System.out.println(n);
		}
	}
}
