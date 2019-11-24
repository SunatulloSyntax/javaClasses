package com.class04;

public class NestedIfTask2 {

	public static void main(String[] args) {
		double mortgageRate = 5.7;
		double mortgagePrice = 2000;

		if (mortgageRate > 4.5) {
			System.out.println("I will not buy the House");
		} else {
			System.out.println("I will consider to buy it");
			if (mortgagePrice > 200000) {
				System.out.println("I will take loan");
			} else {
				System.out.println("I will pay cash");

			}
		}

	}

}
