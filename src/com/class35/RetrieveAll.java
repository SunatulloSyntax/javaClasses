package com.class35;

import java.util.*;

public class RetrieveAll {
	public static void main(String[] args) {
//		Create a map of a person(name, lastName, address, city, state)

		Map<String, String> personMap = new TreeMap<String, String>();
		personMap.put("Name", "Ahmet");
		personMap.put("lastName", "Yildiz");
		personMap.put("Address", "123 ");
		personMap.put("City", "Dallas");
		personMap.put("State", "Tx");

		System.out.println(personMap);
		System.out.println("----how to retrieve a specific value?_-_-_-_-_-_-_-_");
		String value = personMap.get("State");
		System.out.println(value);

		System.out.println("-----------------------------------------how to retrieve all keys and all values?");
		System.out.println("----------Printing all keys");

		Set<String> keys = personMap.keySet();

		for (String key : keys) {
			System.out.println(key + ":" + personMap.get(key));
//			System.out.println("Values: " + personMap.get(key));
		}

		System.out.println("------------------Enhanced Loop");
		Iterator<String> keysIterator = keys.iterator();
		while (keysIterator.hasNext()) {
//			System.out.println(keysIterator.next() + ":" + personMap.get(keysIterator.next()));

			String str = keysIterator.next();
			System.out.println(str + ":" + personMap.get(str));
		}

		System.out.println("-----------Print all values");
		System.out.println("-----------Enhanced Loop");
		Collection<String> values = personMap.values();

		for (String val : values) {
			System.out.println(val);
		}

		System.out.println("-------------Iterator");
		Iterator<String> valuesIterator = values.iterator();
		while (valuesIterator.hasNext()) {
			System.out.println(valuesIterator.next());

		}

		System.out.println("-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-==--=-=-=-VALUES");

//		Collection<String> v = personMap.values();
//		
//		Iterator<String> it1 = v.iterator();
//		while(it1.hasNext()) {
//			String s = it1.next();
//			System.out.println(s);
//		}
//		for (String v1 : v) {
//			System.out.println(v);
//		}
	}
}
