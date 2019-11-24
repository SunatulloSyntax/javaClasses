package com.class08;

import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {
		/*let's ask user to enter if it is raining or not(true or false)
		 * as long as there is rain let's keep asking
		 * as soon as there is no rain  >>> you can go to the park
		 */
		
		Scanner info;
		boolean isRain;
		String answer;
		
		
		info = new Scanner(System.in);
		
		do 
		{
			System.out.println("Is it raining?");
			//isRain = info.nextBoolean();
			answer = info.next();
			
			if (answer.equals("Yes"))
			{
				isRain = true;
			}
			else if (answer.equals("No"))
			{
				isRain = false;
			}
			else
			{
				System.out.println("Not a valid answer");
				isRain = false;
			}
			
		}while(isRain);
		System.out.println("Go to the park");
	}

}
