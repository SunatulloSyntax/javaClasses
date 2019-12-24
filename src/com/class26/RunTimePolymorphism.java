package com.class26;

public class RunTimePolymorphism {
	
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.sleep();
		animal.eat();
		System.out.println("===========");
		
		//creating an object of child class
		Cat cat = new Cat();
		cat.eat(); 
		cat.meow(); //from child
		cat.sleep(); //from child
		
		//widening
		double d = 90;
		//narrowing
		int a = (int)1.99;
		System.out.println("------------");
		//Non Primitive TypeCasting
		//Widening > creating an object of the child class
		//			 and giving reference to the Parent class
		Animal obj = new Cat();
		
		//narrowing
//		Cat obj2 = new Animal();  >>> Cannot convert from animal to Cat
		
		obj.eat(); //coming from parent
		obj.sleep(); //this method will come from child class >>> runtime polymorphism 
//		obj.meow();  >>> compiler error  >>> method won't available
	}

}
