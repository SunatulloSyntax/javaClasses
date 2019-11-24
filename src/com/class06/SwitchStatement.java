package com.class06;

public class SwitchStatement {

	public static void main(String[] args) {
		int day = 9;
		String weekDay;
		
		switch (day) {
		case 1:
			weekDay = "Monday";
			break;
		case 2:
			weekDay = "Tuesday";
			break;
		case 3:
			weekDay = "Wednesday";
	        break;
		case 4:
			weekDay = "Thursday";
			break;
		case 5:
			weekDay = "Friday";
			break;
		case 6: 
			weekDay = "Saturday";
			break;
		case 7:
			weekDay = "Sunday";
			break;
		default:
			weekDay = "Invalid";
		}
		System.out.println(weekDay);
	}

}
