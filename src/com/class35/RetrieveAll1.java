package com.class35;

import java.util.*;
import java.util.Map.Entry;

public class RetrieveAll1 {
	public static void main(String[] args) {
//		Lets create a map of a classroom in which we will store objects and it's quantity

		Map<String, Integer> classRoom = new HashMap<String, Integer>();
		classRoom.put("Instructor", 3);
		classRoom.put("Student", 80);
		classRoom.put("Tables", 20);
		classRoom.put("Chairs", 80);

		System.out.println(classRoom);

		Set<Entry<String, Integer>> entrySet = classRoom.entrySet();
		System.out.println("-----------------Using for each loop to get all entry objects");

		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

		System.out.println("--------------Using iterator to get all entry objects");

		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
		while (entryIterator.hasNext()) {
//			System.out.println(entryIterator.next());
			Entry<String, Integer> ent = entryIterator.next();
			String ent1 = ent.getKey() + " : " + ent.getValue();

			System.out.println(ent1);

		}
	}
}
