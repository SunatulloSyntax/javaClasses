package com.class31_Task;

//Create an Interface ‘Shape’ with undefined methods as calculateArea
//and calculatePerimiter . Create 2 child classes: Circle & Square that 
//should have an implementation of area and perimeter calculation. 
//Test your code.
interface Shape {

	double calculateArea(double length);
	double calculatePerimeter(double length);
}
class Circle implements Shape{
	
	final double pi = 3.14;

	@Override	
	public double calculateArea(double radius) {
		return (int) ((int)2 * pi * radius * radius);
		
	}

	@Override
	public double calculatePerimeter(double radius ) {
		return (int) (2 * Math.PI * radius);
		
	}
	
}
class Square implements Shape{
	
	@Override
	public double calculateArea(double side) {
		return side * side;
		
	}

	@Override
	public double calculatePerimeter(double side ) {
		return 4 * side;
	}
}