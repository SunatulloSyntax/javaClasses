package com.class35;

import java.util.*;
import java.util.Map.Entry;

public class MapDemo {
	public static void main(String[] args) {
		Map<Integer, Integer> hotelMap = new HashMap<>();
		hotelMap.put(101, 3);
		hotelMap.put(102, 3);
		hotelMap.put(103, 2);
		hotelMap.put(201, 4);
		hotelMap.put(202, 3);
		hotelMap.put(206, 7);
		hotelMap.put(301, 5);
		hotelMap.put(303, 4);

//		changing people number in room 102
//		hotelMap.put(102, 4);

		System.out.println("How many rooms ar full? " + hotelMap.size());

//		Get Keys
		System.out.println("---Get Keys---");
		Set<Integer> roomNumbers = hotelMap.keySet();

		Iterator<Integer> roomIterator = roomNumbers.iterator();
		while (roomIterator.hasNext()) {
			int roomNumber = roomIterator.next();
			int amount = hotelMap.get(roomNumber);
			System.out.println(roomNumber + " -> " + amount);
		}

//		Get Values
		System.out.println("---Get Values---");
		Collection<Integer> amountValues = hotelMap.values();
//		System.out.println(amountValues);
		Iterator<Integer> amountIterator = amountValues.iterator();
		while(amountIterator.hasNext()) {
			int amount1 = amountIterator.next();
			System.out.println(amount1);
		}
		
//		System.out.println("-------Alpha order");
//		Set<Integer> alpha = new TreeSet<>(amountValues);
//		
//		Iterator<Integer> it11 = alpha.iterator();
//		while(it11.hasNext()) {
//			int a = it11.next();
//			System.out.println(a);
//		}
	
		System.out.println("-----Get Entries-----");
//		Get Entries
		Set<Entry<Integer, Integer>> entries = hotelMap.entrySet();
		
		Iterator<Entry<Integer, Integer>> entryIterator = entries.iterator();
		while(entryIterator.hasNext()) {
			Entry<Integer, Integer> entry = entryIterator.next();
			Integer roomNumber = entry.getKey();
			Integer amount = entry.getValue();
			System.out.println(roomNumber + " -> " + amount);
		}
		System.out.println();
		System.out.println("Let's find how many people are there in second floor");
		
		int total = 0;
		Set<Integer> keys = hotelMap.keySet();
		Iterator<Integer> iterator = keys.iterator();
		while(iterator.hasNext()) {
			Integer roomNumber = iterator.next();
			if(roomNumber >= 200 && roomNumber < 300) {
				int amount = hotelMap.get(roomNumber);
				System.out.println(amount + " people in room " + roomNumber);
				total += amount;
			}	
		}System.out.println("There are " + total + " people in second floor");
	}
}
