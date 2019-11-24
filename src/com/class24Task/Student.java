package com.class24Task;

public class Student {
	String name, address;
	
	Student(String name, String address){
		this.name = name;
		this.address = address;
	}
	
	void display() {
		System.out.println("The name of the person is " + name 
				+ " and address is " + address);
	}

	
	public static void main(String[] args) {
		Student s = new Student("Saeed", "240 Prospect ave, Hackensack, NJ");
		s.display();
	}
	
}
