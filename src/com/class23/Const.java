package com.class23;

public class Const {
	/*
	 * Write a program that will have a constructor: 
	 * one with parameters and second
	 * without any parameters. Create a separate Test
	 *  class where you will execute
	 * both of the constructors.
	 */

	Const(int a) {
		System.out.println("This constructor has " + a + " a parameter");
	}

	Const() {
		System.out.println("This constructor has no parameter");
	}
}
