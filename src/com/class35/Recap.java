package com.class35;

import java.util.*;

public class Recap {
	public static void main(String[] args) {

//		    How can I access/update just 1 value from the Set collections
		Set<String> lset = new LinkedHashSet<String>(); // keep the order
		lset.add("Morning");
		lset.add("Noon");
		lset.add("Evening");
		lset.add("Night");

//		convert to the ArrayList
		ArrayList<String> myList = new ArrayList<String>();
		myList.addAll(lset);
		String element = myList.get(2);
		System.out.println(element);
		
//		another way to create an Object of ArrayList
		List<String> myList2 = new ArrayList<>(lset);
		System.out.println(myList2);
		
						
		
	}
}
