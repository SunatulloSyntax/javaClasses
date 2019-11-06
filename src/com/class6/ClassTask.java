package com.class6;

import java.util.Scanner;

public class ClassTask {

	public static void main(String[] args) {
		/*ask user to enter the month they born
		 * based on the month define the season
		 * if user is born in Jan, Feb, Dec  >>>  winter
		 * if Mat,Apr,May >>> spring
		 * if Jun, july, Aug >>> Summer
		 * if Sep,Oct,Nov >>> Fall
		 * otherwise >>> unknown
		 * at the end of the program
		 * you were born in _____
		 * */
		
		Scanner info;
		String month;
		//String January, February, March, April, May, June, July, August, September, October, November, December;
		info = new Scanner(System.in);
		
		
		System.out.println("Please enter month you born:");
		month = info.nextLine();
		String born;
		if(month.equals("January") || month.equals("February") || month.equals("December")){
			born = "Winter";
		}else if (month.equals("March") || month.equals("April") || month.equals("May")) {
			born = "Spring";
		}else if (month.equals("June") || month.equals("July") || month.equals("August")) {
			born = "Summer";
		}else if (month.equals("September") || month.equals("October") || month.equals("November")) {
			born = "Fall";
		}else {
			born = "Unknown";
		}
		System.out.println("You were born " + born);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
