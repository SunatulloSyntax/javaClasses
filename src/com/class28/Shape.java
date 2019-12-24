package com.class28;

/*Write program: Shape class has a constructor that 
 * takes the radius and has a subclass as  circle class. 
 * In circle class create a method to calculate the area
 *  of circle. Test your code*/
public class Shape {
	
	double radius;
	Shape(double radius){
	this.radius = radius;
	}
	
	public static void main(String[] args) {
		Circle a = new Circle(3.2);
		System.out.println("The area of the circle is " + a.getArea());
	}
}
class Circle extends Shape{
	
	Circle(double radius){
		super(radius);
	}
	public double getArea() {
		return radius * radius * Math.PI;
	}
}
