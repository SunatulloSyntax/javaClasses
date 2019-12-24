package com.class31;

public class AccountTest {
	
	public static void main(String[] args) {
		
		Account acc = new Account();
//		acc.accountNumber = 3124234; |
//									 | >>> cannot access bc they are private variables
//		acc.balance = 87;			 |
		acc.setAccountNumber(231224237);
		long accountNum = acc.getAccounNumber();
		System.out.println(accountNum);
		
		acc.setBalance(-200);
		double myBalance = acc.getBalance();
		System.out.println(myBalance);
		
		
		int num = 123;
		String.valueOf(num); // converts given value to String 
		
	}
}

