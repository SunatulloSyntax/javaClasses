package com.class23;

public class Student {
/* Write a java program of Class Students that 
 * takes students name and 3 subject grades. 
 * Inside your class also have a method to 
 * Calculate Average Grade. Test Student class 
 * for 5 different students with different marks.
 *  Your program should print an average mark of each students name.*/
	String name;
	int math;
	int bio;
	int comp;
	
	Student(String sName, int a, int b, int c ){
		name = sName;
		math = a;
		bio = b;
		comp = c;
//		av = (a+b+c)/3;
//		averageGrade();
	}
	
	public void averageGrade() {
		int av = (math+bio+comp)/3;
		System.out.println(name + " average grade is: " + av);
	}
}
