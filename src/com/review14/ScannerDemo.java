package com.review14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = 0;
		int b = 0;
		int result = 0;
		try {
			System.out.println("Please give enter a number");
			a = sc.nextInt();

			System.out.println("Please give enter another number");
			b = sc.nextInt();
		} catch (InputMismatchException ime) {
			System.out.println("Sorry, you didn't entered a correct number!");
		} catch (Exception e) {
			System.out.println("Some error occured");
		}
		try {

			result = a / b;
			System.out.println("The division result is: " + result);

		} catch (ArithmeticException ae) {
			System.out.println("I couldn't divide ");
		} catch (InputMismatchException ime) {
			System.out.println("Sorry, you didn't enter a number");
		} catch (Exception ex) {
			System.out.println("Something happened");
		}
		System.out.println("Happy Ending!");

	}
}
