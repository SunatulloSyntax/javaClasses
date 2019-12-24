package com.class32;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<>();
//		to store values inside your collection

		arrayList.add("John");
		arrayList.add("Jane");
		arrayList.add("Jack");

//		to retrieve the value from arrayList
		System.out.println(arrayList.get(1));

//		add more values
		arrayList.add("James");
		arrayList.add("John");
		arrayList.add("Jane");

//		how many elements inside the arrayList?
		int size = arrayList.size();
		System.out.println(size);

		System.out.println("----Array list Integer type-----");
//		creating an Object of ArrayList that will hold numeric values
		ArrayList<Integer> numArrList = new ArrayList<>();
		numArrList.add(100);
		numArrList.add(200);
		numArrList.add(300);

//		update the value
	    numArrList.set(0, 1000);
		
		System.out.println(numArrList);
		
//		retrieving values
		System.out.println(numArrList.get(2));
		for (int num = 0; num < numArrList.size(); num++) {
			System.out.println(numArrList.get(num));
		}

//		enhanced type
		System.out.println("*** Enhancded type ***");
		for (Integer number : numArrList) {
			System.out.println(number);
		}

//		creating an Object of ArrayList that will hold char values
		System.out.println("---with char---");
		ArrayList<Character> arrCharList = new ArrayList<>();
		arrCharList.add('a');
		arrCharList.add('b');
		arrCharList.add('c');
		arrCharList.add('d');
		arrCharList.add('e');
		arrCharList.add('f');
		arrCharList.add('g');
		for (int i = 0; i < arrCharList.size(); i++) {
			System.out.println(arrCharList.get(i));
		}

		System.out.println("---for loop enhanced type---");
		for (char c : arrCharList) {
			System.out.println(c);
		}

	}
}
