package com.review11;

public class Sphere extends Shape3D {
	
	final double radius = 5.99; //instance variable
	
	public Sphere(String color) {
		super(color);
		
	}

	@Override
	public double calculateArea() {
		return 4 * Math.PI * this.radius * this.radius;
	}

	@Override
	public double calculateVolume() {
	   return (4/3) * Math.PI * this.radius * this.radius * this.radius;
	}
}
