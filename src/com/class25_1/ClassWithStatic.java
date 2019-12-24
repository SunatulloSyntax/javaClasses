package com.class25_1;

public class ClassWithStatic {
	
	public static void add() {
		System.out.println("This is non parameter method");
	}
	
	public static void add(int a, int b) {
		System.out.println("This is method with 2 parameters " + a + " " + b);
	}
	
	public static void add(int a, int b, int c) {
		System.out.println("This is method with 3 parameters " + a + " " + b + " " + c);
	}
	

	public static void main(String[] args) {
		ClassWithStatic.add();
		ClassWithStatic.add(1,2);
		ClassWithStatic.add(1,2,3);	
	}
}
