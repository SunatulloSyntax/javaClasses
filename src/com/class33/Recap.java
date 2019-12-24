package com.class33;

import java.util.ArrayList;
import java.util.Iterator;

public class Recap {

	public static void main(String[] args) {
	
//		Let's create an ArrayList to store numbers
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(10);
		numbers.add(100);
		numbers.add(1000);
		
		int size = numbers.size();
		System.out.println(size);
		
//		add more
		numbers.add(100000);
//		remove
		
		System.out.println(numbers.remove(size-1));
		numbers.remove(1);
		System.out.println(numbers);
		
//		retrieve value from an arrayList
		int element = numbers.get(0);
		System.out.println(element);
		
//		1. for loop
		for(int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		
		System.out.println("---Advanced Loop---");
//		advanced loop
		for(Integer num : numbers ) {
			System.out.println(num);
		}
		
//		System.out.println("------backward--------");
////		want to get values backward
//		for(int i = numbers.size() - 1; i >= 0; i++) {
//			System.out.println(numbers.get(i));
//		}
		
		System.out.println("---3 way---");
//		3 using Iterator
		Iterator<Integer> iterator = numbers.iterator();
		
		while(iterator.hasNext()) {
			int number = iterator.next(); // autoboxing
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}


