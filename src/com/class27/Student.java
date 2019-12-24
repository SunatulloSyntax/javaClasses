package com.class27;

public class Student {

	void study() {
		System.out.println("Student is studying");
	}

	private void doHomeword() {
		System.out.println("Student is doing Homework");
	}

	void payFee() {
		System.out.println("Student is paying $30000");
	}

	protected void research() {
		System.out.println("Student needs to do research");
	}
	
	
}

class SyntaxStudent extends Student {

	private void doHomeword() {
		System.out.println("Student is doing Homework");
	}

	void payFee() {
		doHomeword();
		System.out.println("Syntax student is paying $10000");
	}

	void learncode() {
		System.out.println("Syntax student is learning Java coding");
	}
}

class CollegeStudent extends Student {

	@Override
	void payFee() {
		System.out.println("College student is paying $40000");
	}

}

class SchoolStudent extends Student {

	void payFee() {
		System.out.println("School student is paying $35000");
	}

	void stayAtSchool() {
		System.out.println("School student is staying at school");
	}
}
