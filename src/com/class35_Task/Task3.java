package com.class35_Task;

import java.util.Map.Entry;
import java.util.*;

public class Task3 {
	public static void main(String[] args) {
		/*
		 * Create a map of Best Buy store. Place item id and item name into it. Example
		 * (7664847 = Printer, 7879885= TV etc )
		 * 
		 * Retrieve all keys and values from a Best Buy map using EntrySet.
		 */
		
		Map<Integer, String> bestBuy = new HashMap<Integer, String>();
		bestBuy.put(7664847, "Printer");
		bestBuy.put(7879885, "Tv");
		bestBuy.put(7879845, "Mouse");
		bestBuy.put(7879823, "PC");
		bestBuy.put(7879865, "Cable");
		bestBuy.put(7329885, "Keyboard");
		
		Set<Entry<Integer, String>> entries = bestBuy.entrySet();
		
		Iterator<Entry<Integer, String>> entryIterator = entries.iterator();
		while(entryIterator.hasNext()) {
			Entry<Integer, String> en = entryIterator.next();
			Integer num = en.getKey();
			String name = en.getValue();
			System.out.println(num + " = " + name);
		}
		
		
		
	}
}
