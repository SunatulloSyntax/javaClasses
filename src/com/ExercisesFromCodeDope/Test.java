package com.ExercisesFromCodeDope;

public class Test {
	
	int variable = 3; 
	
	void method(int variable) {
		variable = 11;
		System.out.println("Value of inst. variable is " + this.variable);
		System.out.println("Value of the local variable is "  + variable);
	}
	
	void method1() {
		int variable = 22;
		System.out.println("Value of inst. variable is " + this.variable);
		System.out.println("Value of the local variable is " + variable);
	}
	
	public static void main(String[] args) {
		Test a = new Test();
		a.method(123123);
		a.method1();
	}
	
	
	
//		int variable = 5;
//		public static void main(String args[]) {
//			Test obj = new Test();
//			obj.method(20);
//			obj.method();
//		}
//		void method(int variable) {
//			variable = 10;
//			System.out.println("Value of variable :" + variable);
//		}
//		void method() {
//			int variable = 40;
//			System.out.println("Value of variable :" + variable);
//		}
//
	} 


