package com.class30;

public class VehicleTest {

	public static void main(String[] args) {
	   BMW bmw	= new BMW("121234234", "Sedan", "BMW", "X5");
	   bmw.displayTotal();
	   bmw.drive(); // comes from Vehicle class
	   bmw.speed(); 
	   bmw.start();
	   bmw.stop();
	   bmw.breaking();  //comes from Car class
	   bmw.display(); //comes from BMW

	   System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
	   
	   Car car	= new BMW("yuio78", "SUV", "BMW", "X3");
	   car.drive(); // comes from Vehicle class
	   car.speed(); 
	   car.start();
	   car.stop();
	   car.breaking();  //comes from Car class
//	   car.display(); comes from BMW, so wont be available to the parent
	   car.displayTotal();

	   
	   System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
	   
	   Vehicle vehicle	= new BMW("asdsa234", "Truck", "BMW", "A7");
	   vehicle.drive(); // comes from Vehicle class
	   vehicle.speed(); 
	   vehicle.start();
	   vehicle.stop();
//	   vehicle.breaking();  comes from Car class, so wont be available to the parent
//	   car.display(); comes from BMW, so wont be available to the grandparent
	   
	   
	   new BMW("a43a234", "Truck", "BMW", "A7");
	   new BMW("as324rea234", "Sedan", "BMW", "i3");
	   new BMW("asd34234", "Sedan", "BMW", "i7");
	   System.out.println("----------------");
	   
	   vehicle.displayTotal();
	}
}
