package com.class36;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import java.util.Set;
import java.util.TreeMap;

public class Hw {
	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<Integer, String>();
		map.put(23445, "Mac Laptop");
		map.put(13234, "Hp Printer");
		map.put(45345, "Dell Screen");
		map.put(12312, "Samsung Tv");
		map.put(23423, "Sony Camera");
		
		System.out.println(map);
//		to retrieve key - values using entry set
		System.out.println("---------------------to retrieve key - values using entry set");
		Set<Entry<Integer, String>> set = map.entrySet();
		
		for(Entry<Integer, String> entry : set) {
			Integer num = entry.getKey();
			String name = entry.getValue();
			System.out.println(num + " -> " + name);
		}
		
		System.out.println("----Retrieving key and value using iterator");
		Iterator<Entry<Integer, String>> entIt = set.iterator();
		while(entIt.hasNext()) {
			Entry<Integer, String> singleEntry = entIt.next();
			Integer number = singleEntry.getKey();
			String name1= singleEntry.getValue();
			System.out.println(number + " --- " + name1);
		}
	}
}
