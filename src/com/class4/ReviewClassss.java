package com.class4;

import java.util.Scanner;

public class ReviewClassss {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println("please enter 1st number");
        int num1 = input.nextInt();
        System.out.println(" Please enter the operator");
        String operator = input.next();
        System.out.println(" Please enter the 2nd number");
        int num2 = input.nextInt();
        if (operator.equals("+")) {
            System.out.println(num1 + num2);
        } else if (operator.equals("-")) {
            System.out.println(num1 - num2);
        } else if (operator.equals("*")) {
            System.out.println(num1 * num2);
        } else if (operator.equals("/")) {
            System.out.println(num1 / num2);
        } else if (operator.equals("%")) {
            System.out.println(num1 % num2);
        } else {
            System.out.println(" invaild");
        }

	}

}
