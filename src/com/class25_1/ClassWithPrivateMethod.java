package com.class25_1;

public class ClassWithPrivateMethod {
	
	private void floor() {
		System.out.println("This method is in 0 floor");
	}
	
	private void floor(int a) {
		System.out.println("This method is in " + a + " floor");
	}
	
	private void floor(int a, int b) {
		System.out.println("This method is in " + (a+b) + " floor");
	}
	
	public static void main(String[] args) {
		ClassWithPrivateMethod obj = new ClassWithPrivateMethod();
		obj.floor();
		obj.floor(1);		
		obj.floor(1,1);
	}
	
	

}
