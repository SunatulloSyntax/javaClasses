package com.class31_Task;

public class MarkTest {
	public static void main(String[] args) {
		Marks a = new A(67, 87, 98);
		double per = a.getPercentage();
		System.out.println("The percentage marks of the class A is " + per);

		Marks b = new B(65, 87, 98, 56);
		double perb = b.getPercentage();
		System.out.println("The percentage of class B is " + perb);

		Marks a2 = new A(105, 98, 78);
		double percentageA2 = a2.getPercentage();
		System.out.println("The percentage of marks of the object 2 of A is " + percentageA2);
	}
}
