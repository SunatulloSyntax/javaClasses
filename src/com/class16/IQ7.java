package com.class16;

public class IQ7 {
	public static void main(String[] args) {
//		 Write a java program to check whether
//		a given number is prime or not? 
		//1. check if it is divisible the numbers from 2 till half of that int
		//and its divible then it's not prime
		//otherwise it's prime
		/*
		 * first check if remainder is 0
		 * if rem == 0 for any of the half of the number of n
		 * then not prime
		 * else count not equal
		 * 
		 * 
		 * 
		 * */
		int n = 29;
		boolean test = true;
		int cnt = 2; 
		for(int i = 2; i < n/2; i++) {
			if(n % i == 0 ) {
				System.out.println("not");
				break;
			}else {
				//System.out.println(i+" "+n/i);
				cnt++;
			}
		}
		
		if(cnt==n/2)
		{
			System.out.println("prime");
			
		}
		System.out.println("----------------");
		//2. way
		//create for loop method numbers in range of 2 to given number
//		  create if method 
		//when we divide with each number and it's remainder is equal to zero
		//give to boolean variable false if remainder is equal to zero
		//
		
		int a = 111;
		boolean isPrime = true;
		
		for(int i = 2; i < a; i++) {
			if(a%i == 0) {
				isPrime = false;
				//System.out.println(i);
				break;
				
			}
			System.out.println(i);
		}
		
		if(isPrime) {
			System.out.println(a + " is Prime number");
		}else {
			System.out.println(a + " is not Prime number");
		}
		
	}

}
