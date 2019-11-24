package com.class17;

public class Phone {
	//define attributes/ features
	String name, price, brand;
	int model;
	double camera;
	boolean light;
	
	//methods
	void takePicture() {
		System.out.println(brand + " " + name + " can take picture");
	}
//		System.out.println(brand + " name is " + name + 
//				". It costs " + price + " and model is " 
//				+ model + ". It's camera is " + camera 
//				+ " in pixels" + " and light is " + light);
//	}
	void playMusic() {
		System.out.println(brand + " " + name + " can play music");
		
	}
	
}
