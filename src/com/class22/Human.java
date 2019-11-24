package com.class22;

public class Human {
	String name;
	String lastName;
	
	
	public static void main(String[] args) {
		
		Human human1 = new Human();
		human1.name = "John";
		human1.lastName = "Smith";
		
		Human human2 = new Human();
		human2.name = "Jimmy";
		human2.lastName = "Miller";
		human2.lastName = "Doe";
		
		System.out.println(human2.lastName);
		System.out.println(human1.lastName);

	}

}
