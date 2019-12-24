package com.review11;

public class ShapeDemo {

	public static void main(String[] args) {
		Shape2D shape1 = new Circle(3, "red");
		double d = shape1.calculateArea();
		System.out.println(d);
		
		d = shape1.calculatePerimeter();
		System.out.println(d);
		
		Shape2D shape2 = new Rectangle(2, 3, "blue");
		
		d = shape2.calculateArea();
		System.out.println(d);
		d = shape2.calculatePerimeter();
		System.out.println(d);
		
		System.out.println("---Shape array---");
		System.out.println("====1st way====");
		Shape2D[] shapes = new Shape2D[6];
		shapes[0] = shape1;
		shapes[1] = shape2;
		shapes[2] = new Rectangle(3, 4, "yellow");
		shapes[3] = new Circle(2, "brown");
		shapes[4] = new Rectangle(4, 2, "green");
		shapes[5] = new Square(6, "black");
				
				
		double totalArea = 0;
		for(Shape2D shape: shapes) {
			totalArea += shape.calculateArea();
		}
		System.out.println("Total area is " + totalArea);
		
		double totalPerimeter = 0;
		for(int i = 0; i < shapes.length; i++) {
			Shape2D shape = shapes[i];
			totalPerimeter += shape.calculatePerimeter();
		}
		System.out.println("Total perimeter is " + totalPerimeter);
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println(" ---===Shape3D===---");
		
		
		Shape3D sphere = new Sphere("red");
	    
		int s = (int)sphere.calculateArea();
		System.out.println("The area of sphere is " + s);
		
		int v = (int)sphere.calculateVolume();
		System.out.println("The volume of sphere is " + v);
		
		
		Shape3D cube = new Cube("green", 4);
		
		double area = cube.calculateArea();
		System.out.println("The area of the cube is: " + area);
		
		double volume = cube.calculateVolume();
		System.out.println("The volume of the cube is" + volume);
		
		System.out.println("--------Shape Array--------");
		Shape3D[] shape3D = new Shape3D[4];
		shape3D[0] = sphere;
		shape3D[1] = cube;
		shape3D[2] = new Sphere("black");
		shape3D[3] = new Cube("white", 6);
		
		int totalA = 0;
		for(Shape3D shapeD : shape3D) {
			totalA += shapeD.calculateArea();
		}
		System.out.println("The total area of 3D is: " + totalA);
	
		int totalV = 0;
		for(Shape3D shapeD : shape3D) {
			totalV += shapeD.calculateVolume();
		}
		System.out.println("The total volume of 3D is: " + totalV);
		
		
		
	}
	
}
