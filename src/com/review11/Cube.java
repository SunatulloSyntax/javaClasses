package com.review11;

public class Cube extends Shape3D{
	int edge;
	
	public Cube(String color, int edge) {
		super(color);
		this.edge = edge;
	}

	@Override
	public double calculateArea() {
		return 6 * edge * edge;
	}

	@Override
	public double calculateVolume() {
		return edge * edge * edge;
	}
	
}
