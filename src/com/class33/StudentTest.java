package com.class33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student {

	String name;
	int studentId;

	Student(String name, int studentId) {
		this.name = name;
		this.studentId = studentId;
	}

	public void display() {
		System.out.println("My name is " + this.name + " and my student Id is " + this.studentId);
	}

}

public class StudentTest {

	public static void main(String[] args) {
		
//		create an arrayList that will store student typr of objects
		
		List<Student> students = new ArrayList<>();
		
//		Creating Student type of Objects
		Student s = new Student("John", 101);
		Student s1 = new Student("Jane", 102);
		Student s2 = new Student("Jack", 103);
		
//		adding Student type of Objects
		students.add(s);
		students.add(s1);
		students.add(s2);
		
//		display info of each students
		s.display();
		System.out.println(s.name);
		System.out.println();
		s1.display();
		
		System.out.println("----for each----");
//		for each
		for(Student student : students) {
			student.display();
		}
		
//		adding more object of Student Type
		students.add(new Student("Michael", 104));
		students.add(new Student("David", 105));
		students.add(new Student("Esra", 106));
		
		System.out.println("--- Iterators ----");
//		display info each student
		Iterator<Student> myIterator = students.iterator();
		
		while(myIterator.hasNext()) {
//			myIterator.next().display();
			Student obj = myIterator.next();
			obj.display();
		}
	}
}
