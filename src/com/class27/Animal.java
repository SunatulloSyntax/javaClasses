package com.class27;

public class Animal {
	
	Animal(){
		System.out.println("Animal Constructor");
	}

	public static void whoAmI() {
		System.out.println("I am an animal");
	}
	
	
}

class Monkey extends Animal {
	
	Monkey(){
		
	}
//	cannot override static methods instance methods
//	public void whoAmI() {
//		
//	}
//	here we are not overriding
//	when both methods are static within Sub and Super class
//	it is method hiding
	public static void whoAmI() {
		System.out.println("I am a monkey");
	}
}
