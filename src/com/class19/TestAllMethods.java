package com.class19;

public class TestAllMethods {

	public static void main(String[] args) {
		//find the largest number from 300 to 500
		//then identify is the largest number is odd

		CAllMethods obj = new CAllMethods();
		int large = obj.findLargest(300, 500);
		System.out.println(large);
        
		boolean isOdd = obj.isOdd(large);
		System.out.println(isOdd);
		
		System.out.println(" is the same as method below");
		
		System.out.println(obj.isOdd(obj.findLargest(300, 500)));
		System.out.println("==============");
		//call method weekDayName
		//if(tuesday, wednesday,thursday,saturday
		//sunday)  >>> I am learning Java
		String day = obj.weekDayName(5);
		if(day.equals("Tuesday") || day.equals("Wednesday") || 
				day.equals("Thursday") || 
				day.equals("Friday") || day.equals("Sunday")){
			System.out.println("I am learning Java");
		}else {
			System.out.println("I am practicing Java");
		}
		
	}

}
