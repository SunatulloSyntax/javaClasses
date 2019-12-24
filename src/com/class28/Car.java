package com.class28;

public class Car {
	String make, model;

	Car() {
		System.out.println("I am non argument parent constructor");
	}

	Car(String make, String model) {
		this.make = make;
		this.model = model;
	}
}

class Tesla extends Car {
	boolean autopilot;

	Tesla() {
		super(); //compiler willa add by default to make a call to super class
//		           constructor to initialize and subject
		System.out.println("I am a child non argument constructor");
	}

	Tesla(String make, String model, boolean autopilot) {
		//super();
		super(make, model); //constructor call
		this.autopilot = autopilot;
	}

	public void displayInfo() {
		System.out.println("Car " + make + " " + model + " " + " has an autopilot " + autopilot);
	}
}
