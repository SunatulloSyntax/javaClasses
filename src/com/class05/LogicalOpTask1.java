package com.class05;

public class LogicalOpTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day = 13;
		
		if(day >= 1 && day <= 5) {
			System.out.println("It is a weekday");
		}else if (day >= 6 && day <= 7) {
			System.out.println("It is a weekend");
		}else {
			System.out.println("Invalid day");
		}

	}

}
