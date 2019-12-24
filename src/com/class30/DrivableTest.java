package com.class30;

public class DrivableTest {
	
	public static void main(String[] args) {
		Drivable obj = new Toyota();
		obj.drive();
//		Drivable.DRIVE_TEST = false; CE
		
		Toyota toyota = new Toyota();
		toyota.drive();
		toyota.stop();
	}
}
