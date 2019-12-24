package com.class34;

import java.util.*;

public class HashSetDemo2 {

	public static void main(String[] args) {
		
//		create a collection that will store Sweets type of Object and 
//		I do not car about order as long as I do not have duplicate objects
		
		Set<Sweets> sweetSet = new HashSet<>();
		
		Sweets sweet = new Sweets("Cake");
		sweetSet.add(sweet);					// 1
		sweetSet.add(new Sweets("Cookies"));    // 2
		sweetSet.add(new Sweets("Ice-Cream"));  // 3
		sweetSet.add(new Sweets("Baklava"));    // 4
		sweetSet.add(new Sweets("Macaroons"));  // 5
		sweetSet.add(new Sweets("Chocolate"));  // 6
		sweetSet.add(sweet);					// IT WILL NOT ACCEPT because it is duplicated
		
		System.out.println(sweetSet.size()); //6
		
//		how do we print name of each sweet?
		System.out.println("---------- 1 Way");
		for(Sweets element : sweetSet) {
			System.out.println(element.name);
		}
		
		System.out.println("---------- 2 Way");
		Iterator<Sweets> itSweet = sweetSet.iterator();
		while(itSweet.hasNext()) {
			String name1 = itSweet.next().name;
			System.out.println(name1);
		}
		
		
	}
}
