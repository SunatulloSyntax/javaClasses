package com.class32_Tasks;

import java.util.ArrayList;

public class GenericNonGeneric {
	public static void main(String[] args) {
//		Generic
		System.out.println("____ GENERIC ____");
		ArrayList<String> names = new ArrayList<>();
		names.add("Ali");
		names.add("Vali");
		names.add("Said");
		names.add("Valid");
		names.add("Kamol");

		if (names.isEmpty()) {
			System.out.println("is empty");
		} else {
			System.out.println("not empty");
		}

		if (names.contains("Ali")) {
			System.out.println("This name is in array list");
		} else {
			System.out.println("This name is not in array list");
		}

		System.out.println(names.size());
		for (String names1 : names) {
			System.out.println(names1);
		}

//	another way to print all names in array
		System.out.println(names);

		System.out.println("--------========== Another way to do this task ==========----------");

		System.out.println("Is this array list empty ? " + names.isEmpty());
		System.out.println("This array list contains the name Ali " + names.contains("Ali"));
		System.out.println("The size of the array list is " + names.size());
		System.out.println(names);
		System.out.println();
//		ArrayList CAN BE *GENERIC* AND *NON GENERIC*

//		Non Generic
		System.out.println("-----NON GENERIC----");
		
		ArrayList alist = new ArrayList();
		alist.add("Hello");
		alist.add(100);
		alist.add(10.10);
		alist.add(true);
		alist.add('c');
		
		System.out.println(alist);
		
		ArrayList<Double> list = new ArrayList<Double>();
		list.add(100.10);
		
	}
}
