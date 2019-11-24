package com.ExercisesFromCodeDope;

public class Test2 {

	Test2() {
		this(12);
		System.out.println("hello a");
	}

	Test2(int x) {
	
		System.out.println(x);
	}

	public static void main(String args[]) {
		Test2 a = new Test2(10);
	}
//	
//
//	public static void main(String[] args) {
//		Test2 obj = new Test2();
//		obj.method();
//	}
//	
//	void method() {
//		this.method1();
//		System.out.println("This is method");
//	}
//	
//	void method1() {
//		System.out.println("This is mehod 1");
//	}

}
