package com.review11;

public class Circle extends Shape2D {
	final double pi = 3.14;
	int radius;
	
	
	public Circle(int radius, String color) {
		super(color);
		this.radius = radius;
//		this.color = color;
	}
	
	public double calculateArea() {
		return pi * radius * radius;
	}

	public double calculatePerimeter() {
		return 2 * pi * radius;
	}

	@Override
	public double calculateVolume() {
		// TODO Auto-generated method stub
		return 0;
	}
}
