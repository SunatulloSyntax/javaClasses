package com.class19;

public class ClassMethodWithReturn {

	//return type, method name(list of parameters)
	int sum(int num1,int num2) {
		int c = num1 + num2;
		return c;
	}
	
	// method to return largest number
	int findLargest(int num1, int num2) {
		
		int largest;
		if(num1 > num2) {
			largest = num1;
		}else {
			largest = num2;
		}
		return largest;
//		System.out.println("Largest number is " + largest);
		
	}
}
