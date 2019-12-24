package com.class36_Task;

import java.io.DataOutput;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Employee {
	/*
	 * Create a Map that will store Employee name and salary. Write a logic to
	 * retrieve an employee who gets the highest salary. Output should be in the
	 * below format John Smith=$100000
	 */

	public static void main(String[] args) {
		Map<String, Double> employeeMap = new HashMap<String, Double>();
		employeeMap.put("Smith", 100.000);
		employeeMap.put("Ali",   800.000);
		employeeMap.put("Hasan", 123.000);
		employeeMap.put("David", 29.000);
		employeeMap.put("Mahmud",110.000);
		employeeMap.put("Joe",   99.000);

		Collection<Double> val = employeeMap.values();

		System.out.println("------Using for loop");
		double max = 0;
		for (double v : val) {

			if (v > max) {
				max = v;
			}

		}
		System.out.println(max);

		System.out.println("-------Iterator");
		Set<Entry<String, Double>> en = employeeMap.entrySet();
		Iterator<Entry<String, Double>> collIt = en.iterator();
		String maxKey = "";
		double maxValue = 0;
		while (collIt.hasNext()) {
			Entry<String, Double> ent = collIt.next();
			String name = ent.getKey();
			double salary = ent.getValue();

			if (salary > maxValue) {
				maxKey = name;
				maxValue = salary;
			}
		}

//		System.out.println(employeeMap.get(maxKey) + " " + maxKey);
		System.out.println(maxKey + " -> " +  maxValue);

	}
}
