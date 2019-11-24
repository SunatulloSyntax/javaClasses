package com.class07;

import java.util.Scanner;

public class HwCalculator {

	public static void main(String[] args) {
		Scanner info;
		double n1, n2;
		char op;
		info = new Scanner(System.in);
		
		System.out.println("Please enter first number");
		n1 = info.nextDouble();
		
		System.out.println("Please enter operator");
		op = info.next().charAt(0);
		
		System.out.println("Please enter seconde number");
		n2 = info.nextDouble();
		
		double opt=0.0;
		switch(op) {
		case '+':
			opt = n1 + n2;
			break;
		case '-':
			opt = n1 - n2;
			break;
		case '*':
			opt = n1 * n2;
			break;
		case '/':
			opt = n1 / n2;
			break;
		default:
			System.out.println("Invalid operator");
		}
		System.out.println("Result is " + opt);
		
	}

}
