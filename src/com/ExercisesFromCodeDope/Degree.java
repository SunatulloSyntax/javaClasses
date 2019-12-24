package com.ExercisesFromCodeDope;

public class Degree {

	public void getDegree() {
		System.out.println("I got a degree");
	}

	public static void main(String[] args) {
		Degree d = new Degree();
		d.getDegree();
		
		
	}
}

class Undergraduate extends Degree {

	public void getDegree() {
		System.out.println("i am an Undergraduate");
	}
}

class Postgraduate extends Degree {

	public void getDegree() {
		System.out.println("I am a Postgraduate");
	}
}
