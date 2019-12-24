package com.class34_Ex;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {
	public static void main(String[] args) {
		/*
		 * Create a Set of cities in which you want to make sure that insertion order is
		 * maintained. Using Iterator remove any city that starts with “A”;
		 */

		ArrayList<String> countries = new ArrayList<String>();
		countries.add("Afganistan");
		countries.add("Tajikistan");
		countries.add("USA");
		countries.add("Turkey");
		countries.add("Azerbayjan");

		System.out.println(countries);

		System.out.println("---------removing cities that start with 'A'");

		Iterator<String> it = countries.iterator();

		while (it.hasNext()) {

//			String name = it.next();
//			System.out.println(name);
			
			if (it.next().startsWith("A")) {
				it.remove();
			}
		}
		System.out.println(countries);

	}
}
