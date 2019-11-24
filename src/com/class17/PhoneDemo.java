package com.class17;

public class PhoneDemo {

	public static void main(String[] args) {
		Phone iPhone = new Phone();
		iPhone.brand = "iPhone";
		iPhone.name = "6S";
		iPhone.price = "$300";
		iPhone.model = 2016;
		iPhone.camera = 10.3;
		iPhone.light = true;
		iPhone.takePicture();
		iPhone.playMusic();
		
		Phone Android = new Phone();
		Android.brand = "Samsung";
		Android.name = "S8";
		Android.price = "$400";
		Android.model = 2015;
		Android.camera = 13.5;
		Android.light = true;
		Android.takePicture();
		Android.playMusic();
		
		Phone Nokia = new Phone();
		Nokia.brand = "Nokia";
		Nokia.name = "s300";
		Nokia.price = "$200";
		Nokia.model = 2013;
		Nokia.camera = 5.3;
		Nokia.light = false;
		Nokia.takePicture();
		Nokia.playMusic();
		
	}

}
