package com.class05;

import java.util.Scanner;

public class LogicalOpTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner info = new Scanner(System.in);
		
		System.out.println("Please input your height in inches:");
		double height = info.nextDouble();
		
		if (height < 5) {
			System.out.println("Short");
		}else if (height >= 5 && height < 6) {
			System.out.println("Medium");
		}else if (height > 6) {
			System.out.println("Tall");
		}

	}

}
