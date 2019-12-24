package com.review11;

public abstract class Human {
	String name;
	int age;
	int weight;

	public Human() {

//		super(); >>> is automatically CHILD of OBJECT

		System.out.println("A human being is created.");
	}

	public Human(String name) {

//		super() >>> calling super (object constructor)
//					implicitly/hiddenly.

		this(); // calling the default constructor with no parameter.
//		System.out.println("The name of that person is " + this.name);
		this.name = name;
		System.out.println("The name of that person is " + name);
	}

	public Human(String name, int age, int weight) {

		//		super(); >>> implicitly/automatically calling object(super)
//					 constructor.
		
		this(name);
		this.age = age;
		this.weight = weight;
	}

	public abstract String greeting();

	public abstract void talk();
}
