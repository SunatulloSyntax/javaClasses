package com.class2;

public class ModulusOperator {

	public static void main(String[] args) {
		float n1 = 12.4f;
		float n2 = 3.5f;

		float div = n1 / n2;
		System.out.println(div);

		int num1 = 25;
		int num2 = 23;
		int divOfIntegers = num1 / num2;
		System.out.println(divOfIntegers);

		// modulus gives remaining of the division
		int x = 14;
		int y = 3;
		int rem = x % y;
		System.out.println(rem);
		
		int myNumber = 8 + 8 % 2;
		System.out.println(myNumber);

	}

}
