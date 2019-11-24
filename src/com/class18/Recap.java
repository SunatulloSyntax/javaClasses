package com.class18;

public class Recap {
	int students, teachers, classRooms;
	String name, adress, website;
	
	
	void study() {
		System.out.println("Students studying " + name);
	}
	void teach() {
		System.out.println("Teachers teaching " + name);
	}

	public static void main(String[] args) {
		Recap school = new Recap();
		school.name = "Syntax";
		school.students = 200;
		
		Recap school1 = new Recap();
		school1.name = "Pinaccle";
		school1.students = 150;
		
		school1.teach();
		school.study();
		
	}

}
