package com.class6;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*ask user to enter boolean value for sale
		 * if no sale >>> I am not shopping
		 * if sale >>> check the price of the item
		 * based on the amount we will have to calculate the price after discount
		 * if price <20 >>> apply 10%
		 * if price between 20-100 >>> 20%
		 * if between 100-500 >>> 30%
		 * anything else >>> 50%
		 
		 After discount ___ the price of the item reduce from ___ to ___ 
		 
		 */
		
		Scanner info;
		int price;
		double afterDiscount;
		info = new Scanner(System.in);
		
		System.out.println("Please enter value for the sale:  true/false");
		boolean sale = info.nextBoolean();
		
		if(!sale) {
			System.out.println("I am not shopping");
		}
		else {
			//System.out.println("Check the price for the item");
			System.out.println("Enter the price of the item");
			price = info.nextInt();
			if(price < 20) {
				afterDiscount = price * 0.1;
			}
			else if(price >= 20 && price <= 100) {
				afterDiscount = price * 0.2;
			}else if(price > 100 && price <= 500) {
				afterDiscount =price * 0.3;
			}else {
				afterDiscount = price * 0.5;
			}
			System.out.println("After discount " + afterDiscount +" the price of the item reduce from " + price +" to "+ (price - afterDiscount) );

		}
		
	}

}
