package com.class36_Task;

import java.util.Map;
import java.util.Map.Entry;
import java.util.*;

public class CitiesMap {
	/*
	 * Create a Map from array of cities that will sort keys in alphabetical order.
	 * As a key store the name of the city and as a value store the length of the
	 * city (Example: Paris=5, Moscow =6, Washington DC=13 etc..). If any city name
	 * is more than 7 characters remove that city ( use Iterator ).
	 */

	public static void main(String[] args) {
		Map<Integer, String> cityMap = new TreeMap<Integer, String>();
		cityMap.put(2, "Dushanbe");
		cityMap.put(3, "Paris");
		cityMap.put(1, "Washington");
		cityMap.put(4, "New York");
		cityMap.put(6, "Istanbul");
		cityMap.put(7, "Dallas");
		cityMap.put(8, "Bishkek");
		cityMap.put(12, "Tashkent");

		System.out.println("----------Printing size");
		System.out.println(cityMap.size());

		System.out.println("---------EntrySet");

		Set<Entry<Integer, String>> cityEnt = cityMap.entrySet();

		System.out.println("---------Using Iterator");
		Iterator<Entry<Integer, String>> entIt = cityEnt.iterator();

		while (entIt.hasNext()) {
			Entry<Integer, String> entry = entIt.next();
			Integer number = entry.getKey();
			String nameOfCity = entry.getValue();
			if (nameOfCity.length() > 7) {
				entIt.remove();
//				System.out.println(nameOfCity + " --> " + number);
			}
		}System.out.println(cityMap);
	}
}
