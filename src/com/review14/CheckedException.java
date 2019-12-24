package com.review14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckedException {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Please give enter a number");
		int a = sc.nextInt();
		}catch(Exception e) {
//			if(e instanceof InputMismatchException) {
//				System.out.println("This is a an inputMismatchException");
//			}
			System.out.println("Exception -> " + e);
			System.out.println("Message   -> " + e.getMessage());
//			System.out.println("Class     -> " + e.getClass());
		}finally {
			System.out.println("Happy Ending!");
		}
		
//		try {
////			check exception, you have to handle
//			Thread.sleep(1000);
//		}catch(InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println("Please give enter another number");
//		int b = sc.nextInt();
//		
		
	}
}
