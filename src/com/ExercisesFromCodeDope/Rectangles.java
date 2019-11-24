package com.ExercisesFromCodeDope;

public class Rectangles {
	
/*	Create a class named 'Rectangle' with two data members- 
 *   length and breadth and a method to claculate the area 
 *   which is 'length*breadth'. The class has three constructors
 *    which are :
		1 - having no parameter - values of both length 
		    and breadth are assigned zero.
		2 - having two numbers as parameters - the two 
		    numbers are assigned as length and breadth respectively.
		3 - having one number as parameter - both length
		    and breadth are assigned that number.
		Now, create objects of the 'Rectangle' class having
	    none, one and two parameters and print their areas.
*/
	
	int length;
	int breadth;
	int area;
	
	public int calculate() {
		return area = length*breadth;
	}
	
	public Rectangles() {
		length = 0;
		breadth = 0;
	}
	public Rectangles(int a, int b) {
		length = a;
		breadth = b;
	}
	public Rectangles(int a) {
		length = a;
		breadth = a;
	}
	
	public static void main(String[] args) {
		Rectangles obj = new Rectangles();
		Rectangles obj1 = new Rectangles(3,4);
		Rectangles obj2 = new Rectangles(5);
		
		System.out.println(obj.calculate());
		System.out.println(obj1.calculate());
		System.out.println(obj2.calculate());
	}

}
