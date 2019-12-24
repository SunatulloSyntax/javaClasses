package com.class36_Task;

import java.util.*;

public class CollectionTask1 {
	/*
	 * Create a collection of integers in which you can keep duplicates. Write a
	 * logic to find sum of all integers
	 */

	public static void main(String[] args) {
		Collection<Integer> sets = new ArrayList<>();
		sets.add(1);
		sets.add(2);
		sets.add(3);
		sets.add(1);
		sets.add(2);
		sets.add(3);
		
		int total = 0;
		for(Integer i : sets) {
			total += i;
		}
		System.out.println(total);
		
		
	}
}
