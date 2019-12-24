package com.class31_Task;

public class ShapeTest {

	public static void main(String[] args) {
//		Shape c = new Circle();
//		c.calculateArea();
//		c.calculatePerimeter();
	
		System.out.println();
		
		Shape s = new Square();
		double d = s.calculateArea(2);
		System.out.println("The area of the square is " + d);
//		s.calculatePerimeter();
	}
}
