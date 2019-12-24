package com.class36_Task;

import java.util.*;
import java.util.Map.Entry;

public class CollectionTask {
	/*
	 * Create the collection that will store single uniques Objects of a String type
	 * in which order is preserved. Write a logic to concatenate all string from the
	 * collection.
	 */
	public static void main(String[] args) {
		Collection<String> coll = new ArrayList<String>();
		coll.add("Today");
		coll.add("is");
		coll.add("Java");
		coll.add("class");
		coll.add("day");

		String concat = "";
		for (String str : coll) {
			concat += str + " ";
		}
		System.out.println(concat);
		
		
		
		
	}
}
