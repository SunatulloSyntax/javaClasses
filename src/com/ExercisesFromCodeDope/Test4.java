package com.ExercisesFromCodeDope;

public class Test4 {

	Test4 getTest4() {
		return this;
	}
	
	void method() {
		System.out.println("I'm confused");
	}
//	void method1(Test4 a) {
//		System.out.println("Abc");
//	}
	
//	void method2() {
//		int a = 3;
//		method1(this);
//		int b = 5;
//	}
	public static void main(String[] args) {
		
		Test4  t4 = new Test4();
		t4.getTest4().method();
		
		new Test4().getTest4().method();
//		Test4 obj = new Test4();
//		obj.method2();
	}

}
