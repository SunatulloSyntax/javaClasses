package com.class02;

public class ArithmeticOperations {
	/*
	 * Declare 2 variables and initialize them display resulto of addition,
	 * substraction, multiplication, and division
	 */
	public static void main(String[] args) {
		int num1 = 12, num2 = 13;

		System.out.println(num1 + num2);
		System.out.println("The sum of num1 and num2 is " + (num1 + num2));
		System.out.println(num1 / num2);

		int sum1 = num1 + num2;
		System.out.println(sum1);

		int n1 = 2, n2 = 4, s = n1 + n2;
		System.out.println(s);

		int sum = num1 + num2;
		int sub = num1 - num2;
		int mult = num1 * num2;
		int div = num1 / num2;
		System.out.println("the addition of 2 numbers is " + sum);
		System.out.println("the subtraction of 2 numbers is " + sub);
		System.out.println("the multiplication of 2 numbers is " + mult);
		System.out.println("the division of 2 numbers is " + div);

	}

}
