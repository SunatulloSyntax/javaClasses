package com.class07;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		Scanner info;
		double n1,n2,n3;
		
		info = new Scanner(System.in);
		
		n1 = info.nextDouble();
		n2 = info.nextDouble();
		n3 = info.nextDouble();
		
		if(n1 > n2) {
			if(n1 > n3) {
				System.out.println("The largest number is " + n1);
			}
			else {
				System.out.println("The largest number is " + n3);
			}
		}
		else {
			if(n2 > n3) {
				System.out.println("The largest number is " + n2);
			}
			else {
				System.out.println("The largest number is " + n3);
			}
		}
		
	}

}
