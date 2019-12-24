package com.class34;

import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {

//		1.let's create a collection of vegies where I do not 
//		  want to have duplicates
//   	2. hset order of the elements are not preserved
		HashSet<String> hset = new HashSet<>();
//		storing values into hashSet
		hset.add("cucumber");
		hset.add("onion");
		hset.add("pepper");
		hset.add("zuccini");
		hset.add("carrot");
		hset.add("zuccini");

		System.out.println(hset.size());
		System.out.println(hset);

//		they do not have any methods to retrieve elements from the collection
//		.get();, .set();

//		hw can we retrieve all elements?
//		iterator

		Iterator<String> it = hset.iterator();
		while (it.hasNext()) {
			String element = it.next();
			System.out.println(element);
		}
		
		System.out.println("----------------");
//		enhanced for loop
		
		for(String el : hset) {
			System.out.println(el);
		}

	}
}
