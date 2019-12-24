package com.class34;

import java.util.*;

public class SetFamilyMembers {
	
//	No duplicate   and no order--> HashSet
//	
//	No dupicate    and insertion order --> LinkedHashSet
//	
//	No duplicate   and ascending order--> TreeSet

	public static void main(String[] args) {
//		create a collection that won't allow duplicates
//		and preserve the insertion order
		Set<String> fruitSet = new LinkedHashSet<>();
		fruitSet.add("Apple");
		fruitSet.add("Banana");
		fruitSet.add("Kiwi");
		fruitSet.add("Grape");
		fruitSet.add("Pinapple");
		fruitSet.add("Banana");		//not allowed duplicates
		
		System.out.println(fruitSet.size());
		System.out.println(fruitSet);  // allows insertion order
		
		System.out.println("---------- T r e e S e t ----------------");
		
//		TreeSet -> not preserve insertion order but alphabetical order
		Set<String> fruitSet1 = new TreeSet<>();
		fruitSet1.add("Apple.");
		fruitSet1.add("Banana.");
		fruitSet1.add("Kiwi.");
		fruitSet1.add("Grape.");
		fruitSet1.add("Pinapple.");
		fruitSet1.add("Banana.");		//not allowed duplicates
		
		System.out.println(fruitSet1.size());
		System.out.println(fruitSet1);
		
		System.out.println("----- 2nd E X A M P L E --------");
		
//		          -> OR numerical order
		Set<Integer> tset = new TreeSet<>();
		tset.add(200);
		tset.add(2000);
		tset.add(20);
		tset.add(999);
		tset.add(0);
		tset.add(999);		//not allowed duplicates
		tset.add(0);		//not allowed duplicates
		
		System.out.println(tset.size());
		System.out.println(tset);

//		Adding Collection into a Collection
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Selenium");
		list.add("TestNG");
	
		
		
		System.out.println("--- L I N K E D HashSet ---");
		
		Set<String> linkedSet = new HashSet<String>(); // HashSet -> 'I don't care about order'.
		linkedSet.addAll(fruitSet);
		linkedSet.addAll(list);
		
		System.out.println("Objects from both collections");
		System.out.println(linkedSet);
	}
}
