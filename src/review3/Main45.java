package review3;

import java.util.Scanner;

public class Main45 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scanner.nextInt();

//		if (num % 2 == 0) {
//			System.out.println("Value is even");
//			if (num > 100) {
//				System.out.println("Value is too large");
//			} else {
//				System.out.println("Value is just right");
//			}
//		} else {
//			if (num < 100) {
//				System.out.println("Value is just right and is an odd number");
//			} else {
//				System.out.println("This is an odd number and value is too high");
//			}
//		}

		if (num % 2 == 0) {
			System.out.println("Value is even");
			if (num > 100) {
				System.out.println("Value is too large");
			} else {
				System.out.println("Value is just right");
			}
		} else if (num < 100) {
			System.out.println("Value is just right and is an odd number");
		} else {
			System.out.println("This is an odd number and value is too high");
		}
	}
}