package com.class36_Task;

import java.util.Map;
import java.util.Map.Entry;

import org.omg.CORBA.PolicyError;

import java.util.*;

class Person {
	String name, lastName;
	int age, salary;

	Person(String name, String lastName, int age, int salary) {
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
	}

	public void info() {
		System.out.println("Name: " + name + "/ Last name: " + lastName + "/ age:" + age + "/ salary: " + salary);
		
	}
	
	
}

public class Task {
	/*
	 * Create a Person class with following private fields: name, lastName, age,
	 * salary. Variables should be initialized through constructor. Inside the class
	 * also create a method to print user details. In Test Class create a Map that
	 * will store key in ascending order. In that map store personId and a Person
	 * Object. Print each object details.
	 */
	public static void main(String[] args) {
		Map<Integer, Person> personMap = new TreeMap<Integer, Person>();
		personMap.put(1234, new Person("Ali", "Vali", 26, 80000));
		personMap.put(3214, new Person("Kean", "Roy", 30, 9000));
		personMap.put(2132, new Person("Owen", "Wilson", 29, 10000));
		personMap.put(2341, new Person("Neymar", "Junior", 31, 86000));
		personMap.put(2342, new Person("Nister", "Roy", 30, 81000));
		
		Set<Entry<Integer, Person>> entry = personMap.entrySet();
		
		for(Entry<Integer, Person> e : entry) {
			Integer Id = e.getKey();
			Person person = e.getValue();
			
			System.out.print(Id + " ---> ");
			person.info();
			System.out.println();
		}
		
		System.out.println("---------- O R ----------");
		
		for(Integer forLoopNewWay : personMap.keySet()) {
			Person persoN = personMap.get(forLoopNewWay);
			System.out.print(forLoopNewWay + " -->>> ");
			persoN.info();
			System.out.println();
		}
	}
}
