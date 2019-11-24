package com.class19;

public class CAllMethods {
	//create methos to return value of sum
	//sub
	//mult
	//div
	
	int sum(int a, int b) {
		int r = a + b;
		return r;
	}
	
	int sub(int a, int b) {
		int r = a - b;
		return r;
	}
	
	
int findLargest(int num1, int num2) {
		
		int largest;
		if(num1 > num2) {
			largest = num1;
		}else {
			largest = num2;
		}
		return largest;
}
		
	//method to return whether number is odd
	boolean isOdd(int num) {
		boolean isOdd;
		
		if(num%2 != 0) {
			isOdd = true;
		}else {
			isOdd = false;
		}
		return isOdd;
	}
	
	/*method will take day number and return
	 * and return a week day name
	 * */
		String weekDayName(int weekDay) {
			String weekDayName;
			
			switch(weekDay) {
			
			case 1:
				weekDayName = "Monday";
				break;
			case 2:
				weekDayName = "Tuesday";
				break;
			case 3:
				weekDayName = "Wednesday";
				break;
			case 4:
				weekDayName = "Thursday";
				break;
			case 5:
				weekDayName = "Friday";
				break;
			case 6:
				weekDayName = "Saturday";
				break;
			case 7:
				weekDayName = "Sunday";
				break;
				default:
					weekDayName = "Unknown";
			
			}
			return weekDayName;
			
		}
	
	

}
