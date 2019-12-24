package com.class25_1;

public class Addition {
	//method overloading:
	//1 by passing different amount of parameters
	
	
	public void add(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	public void add(int num1, int num2, int num3) {
		System.out.println(num1+num2+num3);
	}
	
//	public int add(int num1, int num2) {  
//		return num1+num2;  >>> compiler givers an error
//	}
//	
	//2 by having different types of parameters
	public void add(double num1, double num2) {
		System.out.println(num1+num2);
	}
	
	public void add(int num1, double num2) {
		System.out.println(num1+num2);
	}
	
	public static void main(String[] args) {
		Addition obj = new Addition();
		obj.add(1, 3);
		obj.add(1, 3, 4);
		obj.add(12.09, 12.1);
		
		String str = "Hello";
		str.substring(3);
		str.subSequence(1, 3);
		
		
	}
	
}
