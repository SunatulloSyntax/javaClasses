package com.class32;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("Ali");
		names.add("Vali");
		names.add("Said");
		names.add("Valid");
		names.add("Kamol");

//		retrieve values from an ArrayList
//		1 - for loop
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		System.out.println("====== ENHANCED ======");
//		2 - using enhances for loop
		for (String name : names) {
			System.out.println(name);
		}

//		3 - using Iterator
		Iterator<String> it = names.iterator();
		
	}
}
