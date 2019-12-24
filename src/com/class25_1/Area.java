package com.class25_1;

public class Area {
	
	public void area(int a, int b) {
		System.out.println("The area of rectangle is " + (a*b));
	}
	
	public void area(int a) {
		System.out.println("The area of square is " + (a*a));
	}
	
	public void area(int a, int b, int c) {
		System.out.println("The area of cube is " + (a*b*c));
	}
	
	public static void main(String[] args) {
		Area overloading = new Area();
		overloading.area(4,5);
		overloading.area(4);
		overloading.area(3,4,5);
		
	}
}
