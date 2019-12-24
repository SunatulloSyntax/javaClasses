package com.class38;

public class ThrowKeyWord2 {

	public static void main(String[] args) {
		try {
		checkAge(12);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
//	Create a method that will check if is older than 18
//	if it is not then we want to show an exception
	
	public static void checkAge(int age) {
		
		if(age > 18) {
			System.out.println("You can get driver license");
		}else {
			throw new RuntimeException("You must be older than 18!");
		}
	}
}
