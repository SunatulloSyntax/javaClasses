package com.class5;

public class LogicalOp {

	public static void main(String[] args) {
		int day = 5;
		// false OR false >> false
		if (day == 2 || day == 4) {
			System.out.println("SDLC class");
			//true OR false >> true
		}else if (day == 6 || day == 7) {
			System.out.println("Java class");
			//false OR false >> false
		}else if (day == 1 || day == 5) {
			System.out.println("No class");
		}else if (day == 3) {
			System.out.println("Review class");
		}else {
			System.out.println("Not a valid day");
		}
	}

}
