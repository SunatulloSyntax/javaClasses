package com.ExercisesFromCodeDope;

public class A {
	
	public static void print() {
		System.out.println("Parent");
	}
	
	public static void main(String[] args) {
		A a=	new A();
		a.print();
		
		A b =new B();
		b.print();
	}
}
class B extends A{
	
	public static void print() {
		System.out.println("Child");
	}
}
