package com.class25;

public class Employee {
	public static String companyName; // accessible through the 
	int salary;  // accessible within same package
	protected int employeeId; //
	private String employeeSsn; //accessible
	
	
	void work() {
		System.out.println("I work in " + companyName + " company");
	}
	
	void getPaid() {
		System.out.println("I get paid " + salary);
	}
}
