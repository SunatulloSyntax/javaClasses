package com.class3;

public class ElseIfRecap {
	public static void main(String[] args) {
		/*Class schedule
		 * if Tuesday >>> SDLC
		 * if Wednesday >>> java review
		 * if Thursday >>> SDLC
		 * if Saturday >>> java coding
		 * if Sunday >>> my favorite coding
		 * 
		 * */
		int day = 9;
		
		if (day == 2) {
			System.out.println("SDLC class");
		}
		else if (day == 3) {
			System.out.println("Review class");
		}
		else if (day == 4) {
			System.out.println("SDLC class");
		}
		else if (day == 6) {
			System.out.println("Java coding");
		}
		else if (day == 7) {
			System.out.println("My favourite class");
		}
		else {
			System.out.println("There is no class at school");
			}
		
		
		
		boolean b = false;
		boolean classToday = true;

		if (b){
		    System.out.println("Hello");

		    if (classToday){
		    System.out.println("Hello friends");
		    }
		}
		else{
		System.out.println("Bye");
			}
		System.out.println("neither");
	}

}
