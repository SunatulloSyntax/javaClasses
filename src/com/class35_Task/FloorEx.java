package com.class35_Task;

import java.util.*;
import java.util.Map.Entry;

public class FloorEx {
	public static void main(String[] args) {
		Map<Integer, Integer> building = new TreeMap<Integer, Integer>();
		building.put(101, 3);
		building.put(201, 2);
		building.put(301, 4);
		building.put(304, 2);
		building.put(305, 5);
		building.put(400, 1);
		building.put(403, 1);
	
		System.out.println("How many rooms are full? " + building.size());
		
		System.out.println("---Get Keys---");
		Set<Integer> keys = building.keySet();
		
		Iterator<Integer> iterator = keys.iterator();
		while(iterator.hasNext()) {
			Integer fl = iterator.next();
			Integer am = building.get(fl);
			System.out.println(fl + " -> " + am);
		}
		
		System.out.println("---Get Values---");
		Collection<Integer> values = building.values();
		
		Iterator<Integer> valueIt = values.iterator();
		while(valueIt.hasNext()) {
			
			Integer v = valueIt.next();
			System.out.println(v);
		}
		
		System.out.println("---Get Entries");
		Set<Entry<Integer, Integer>> entr = building.entrySet();
		
		Iterator<Entry<Integer, Integer>> entryIterator = entr.iterator();
		while(entryIterator.hasNext()) {
			Entry<Integer, Integer> entries= entryIterator.next();
			Integer f = entries.getKey();
			Integer a = entries.getValue();
			System.out.println(f + " -> " + a);
		}
		
		System.out.println("Using Entry method-------------------");
		System.out.println("Let's find how many people are there in third floor");
		int total = 0;
		Set<Entry<Integer, Integer>> e = building.entrySet();
		
		Iterator<Entry<Integer, Integer>> it = e.iterator();
		while(it.hasNext()) {
			Entry<Integer, Integer> ent = it.next();
			Integer floor = ent.getKey();
			Integer amount = ent.getValue();
			if(floor >= 300 && floor < 400) {
				System.out.println("In floor " + floor + " there are " + amount + " people");
				total += amount;
			}
		}System.out.println("There are "+ total +" people in third floor");
		
				
		System.out.println(" --------------2nd Way without Entry method");
		Set<Integer> value2 = building.keySet();
		
		int total1 = 0;
		Iterator<Integer> vIt = value2.iterator();
		while(vIt.hasNext()) {
			Integer roomNumber = vIt.next();
			if(roomNumber >= 300 && roomNumber < 400) {
				Integer amount1 = building.get(roomNumber);
				System.out.println(amount1 + " people in floor " + roomNumber);
				total1 += amount1;
			}
		}
		System.out.println("There are " + total1 + " people in third floor");
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
	}
}
