package com.class35_Task;

import java.util.*;

public class Task1 {
	public static void main(String[] args) {
		Map<Integer, String> building = new HashMap<Integer, String>();
		building.put(1, "Google");
		building.put(2, "Syntax");
		building.put(3, "Microsoft");
		building.put(4, "Chrome");
		building.put(5, "Apple");
		building.put(6, "Windows");
		building.put(7, "Windows");
		building.put(7, "Windows");
		
		System.out.println(building);
		System.out.println("Number of floors " + building.size());
		building.put(4, "Samsung");
		building.remove(7);
		System.out.println("After updating the building " + "\n" + building);
		
	}
}
