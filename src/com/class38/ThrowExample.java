package com.class38;;

public class ThrowExample {

	
		
		static String name = "John";
		
		public static void studentSleeping() throws InterruptedException {
			
			System.out.println("Student is " + name + " is sleeping");
			Thread.sleep(3000);
		}
		
		public static void callingSleepingStudent() throws InterruptedException{
			studentSleeping();
		}
		public static void callingMore() throws InterruptedException{
		try {
			callingSleepingStudent();
		}catch(InterruptedException e ) {
			System.out.println("Interrupted Exception");
		}
		}
	
		
}
