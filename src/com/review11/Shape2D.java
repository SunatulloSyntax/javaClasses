package com.review11;

public abstract class Shape2D extends Shape{
	
	
	public Shape2D(String color) {
		super(color);
	}
	
	public abstract double calculateArea();
	
	public abstract double calculatePerimeter();
}
