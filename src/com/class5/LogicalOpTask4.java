package com.class5;

import java.util.Scanner;

public class LogicalOpTask4 {
//to import short cut is ctrl+shift+O  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ask user to enter daily sales
		 * based on the sales range we want to give commision to the person
		 * if sales is <100 >>> commission is 10%
		 * if sales is between 100-200 >>> commission of 20%
		 * etc...
		 * */
		Scanner info;
		double salesAmount;
		double commission;
		
		info = new Scanner(System.in);
		
		System.out.println("Please enter your sales amount");
		salesAmount = info.nextDouble();
		
		if(salesAmount >=1 && salesAmount < 100) {
			// let's give user 10% commission of a sale
			commission = salesAmount*0.1;
			
		}else if (salesAmount >= 100 && salesAmount < 200) {
			commission = salesAmount*0.2;
		}else if (salesAmount >= 200 && salesAmount < 500) {
			commission = salesAmount*0.3;
		}else if (salesAmount >= 500) {
			commission = salesAmount*0.5;
		}else {
			commission = 0;
		}
		
		System.out.println("Your commission is " + commission);
		
		
		
		
		
		

	}

}
