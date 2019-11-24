package com.class19;

public class TaskEmail {

	public static void main(String[] args) {
		CTaskEmail obj = new CTaskEmail();
		String email = obj.createEmail("Sam", "Saeed", "gmail");
		System.out.println(email);
		
		boolean isPrime = obj.isPrime(11);
		System.out.println(isPrime);
		
		char grade = obj.getGrade(80);
		
//		System.out.println(grade);
		//OR
//		System.out.println(obj.getGrade(80));
	}

}
