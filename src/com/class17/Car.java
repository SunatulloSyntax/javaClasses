package com.class17;

public class Car {

		//define attributes/features  >>>  variable
		String make, model, color;
		int year, wheels, windows, speed;
		
		//adding behavior/ action  >>>  methods();
		void drive() {
//			System.out.println(make + " can drive");
			System.out.println("Car " + make + " can drive");
		}
		void start() {
			System.out.println("Car " + make + " can start");
		}
		void accelerate() {
			System.out.println("Car " + make + " can accelerate");
		}
//		 void start () {
//		        boolean isCarOn = true;
//		        
//		        if (isCarOn) {
//		            System.out.println("Car " + make +  " start now");
//		        }else {
//		            System.out.println("Car " + make + " is off");
//		        }
//		    }
}
