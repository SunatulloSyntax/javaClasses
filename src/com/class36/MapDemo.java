package com.class36;

import java.util.*;

public class MapDemo {
	public static void main(String[] args) {
		// Map is collection of entry objects which are key and value pair object
		// Map is not a part of collection framework
		// every key in the mapholds unique objects
		// HashMap-->order is not maintained
		// TreeMap-->key objects store in ascending order
		// LinkedHashMap-->order is preserned on ke objects
		// HashTable-->similar to the HashMap
		// Map<K,V> variableName=new MapChildObject<>();

		Map<String, Integer> groceryMap = new LinkedHashMap<>();
		groceryMap.put("Milk", 2);
		groceryMap.put("Tea", 3);
		groceryMap.put("Onion", 5);
		groceryMap.put("Apple", 10);
		// retrieve single value
		groceryMap.get("Apple");
		// verify if specific key or value is in the map
		groceryMap.containsKey("Milk");
		groceryMap.containsValue(2);
		// how to retrieve all values?
		Collection<Integer> values = groceryMap.values();
		for (Integer val : values) {
			System.out.println(val);
		}
		Iterator<Integer> valIt = values.iterator();
		while (valIt.hasNext()) {
			System.out.println(valIt.next());
		}
		// get all keys and map them tovalues(milk->2)
		Set<String> keys = groceryMap.keySet();
		for (String k : keys) {
			System.out.println(k.toUpperCase() + " -> " + groceryMap.get(k));
		}

		
		Iterator<String> keyIterator = groceryMap.keySet().iterator();
		while(keyIterator.hasNext()) {
			
		}
	}
}
