package com.class27;

public class Student_Test {
	public static void main(String[] args) {
		Student st = new CollegeStudent();
		st.study();
		
		
		System.out.println("------");
//		this one is POLYMORPHISM
//		Because we create of object of Syntax student by variable
//		of parent class
		Student st1 = new SyntaxStudent();
		st1.payFee();
		st1.study();
		st1.research();
//		st1.doHomework();  >>> not visible since inside the patent class 
//		 				   >>> it's private
		
		
	}
}
