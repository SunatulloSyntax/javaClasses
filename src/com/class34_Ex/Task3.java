package com.class34_Ex;

import java.util.*;

class Student {
	String name;
	int studentId;

	Student(String name, int studentId) {
		this.name = name;
		this.studentId = studentId;
	}
}

public class Task3 {
	public static void main(String[] args) {
		/*
		 * Create a Set collection that will hold Objects of Student Type. In this set
		 * we do not care about the insertion order. Each student object should have
		 * name and studentID. Display name of each student.
		 */
		Set<Student> s = new HashSet<Student>();
		s.add(new Student("Ali", 123));
		s.add(new Student("Sam", 321));
		s.add(new Student("Homid", 111));
		s.add(new Student("Bilol", 222));
		
		for(Student element : s) {
			System.out.println("Student name is: " + element.name);
		}
		
		System.out.println("--- Using IteratoR ---");
		Iterator<Student> it = s.iterator();
		while(it.hasNext()) {
			String element = it.next().name;
			System.out.println("Student name is:  " + element);
		}
	}
}
