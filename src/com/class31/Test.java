package com.class31;

public class Test {

	public static void main(String[] args) {
//		Parent p = new Child();  // In polymorphism static methods cannot be overriden
//		Parent.hello();
		
		Parent parent = new Child();
		parent.hello();
		
//		Child c = new Child();
//		Child.hello();
		
		
	}
}
