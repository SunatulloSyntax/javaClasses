package com.class38;

public class ThrowsKeyword {

	public static void main(String[] args) {

		System.out.println("Beginning");
		callingExceptionMethod();
		System.out.println("End");
	}
   
	public static void throwsException() {
		System.out.println("Creating an exception");
		ArithmeticException ae = new ArithmeticException();
		throw (ae);
	}

	public static void callingExceptionMethod() {
		
		try {
		throwsException();
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic E got caught");
		}
	}
}
