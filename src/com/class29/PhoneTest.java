package com.class29;

public class PhoneTest {

	public static void main(String[] args) {
		//you cannot directly create an object of abstract class
		//Phone phone = new Phone(); >>> CE: cannot instanciate
		
		//we can create it directly
		
		Phone phone = new iPhone();
		phone.makeCall();
		phone.sendText();
		phone.takePictures();
		phone.playGames();
	}
}
