package com.checking;

import java.util.Scanner;

public class IfNested {

	public static void main(String[] args) {
		Scanner info;
		double n1, n2, n3;
		double max;
		info = new Scanner(System.in);
		
		System.out.println("Please enter 3 different decimal numbers, respectively ");
		n1 = info.nextDouble();
		n2 = info.nextDouble();
		n3 = info.nextDouble();
		
		if(n1 > n2 && n1 > n3) {
			max = n1;
		}else if(n2 > n3) {
			max = n2;
		}else {
			max = n3;
		}
		System.out.println("Maximum number is " + max);
	}

}
