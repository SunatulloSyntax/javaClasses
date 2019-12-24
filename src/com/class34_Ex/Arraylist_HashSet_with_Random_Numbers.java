package com.class34_Ex;

import java.util.*;
public class Arraylist_HashSet_with_Random_Numbers {
public static void main(String[] args) {
	
	Random rnd = new Random();
	int bound = 10;
	int count = 10;
	
	ArrayList<Integer> numbers1 = new ArrayList<Integer>();
	for(int i = 0; i < count; i++) 
		numbers1.add(rnd.nextInt(bound));
	
	
	System.out.println("Array 1 (randomly created " + count + " numbers)" 
	+ "\nNumber of elements in array: " + numbers1.size());
	
	System.out.println(numbers1);
	System.out.println();
	
	ArrayList<Integer> numbers2 = new ArrayList<Integer>();
	for(int i = 0; i < count; i++) 
		numbers2.add(rnd.nextInt(bound));
	
	System.out.println("Array 2 (randomly created " + count + " numbers)" 
			+ "\nNumber of elements in array: " + numbers2.size());
	
	System.out.println(numbers2);
	System.out.println();
	
//	merge 2 arrays into one
	ArrayList<Integer> merged1 = new ArrayList<Integer>();
	merged1.addAll(numbers1);
	merged1.addAll(numbers2);
	
	System.out.println("Array 3  (array1 + array2)" 
	+ "\nNumber of elements in array : " + merged1.size());
	
	System.out.println(merged1);
	System.out.println();
	
//	merge 2 arrays into one eliminates same numbers
	HashSet<Integer> merged2 = new HashSet<Integer>();
	merged2.addAll(numbers1);
	merged2.addAll(numbers2);
	
	System.out.println("Array 4   (array 1 + array2) excluded same numbers"
	+ "\nNumber of elements in array: " + merged2.size());
	
	System.out.println(merged2);
	System.out.println();
	
	
}

	
}
