package com.class17;

public class ObjectOfStudentClass {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.id = 12;
		student1.age = 14;
		student1.grade = "6B";
		student1.name = "Ali";
		System.out.println(student1.name + " is " + student1.age + " years old. " + student1.name + " studies in "  + student1.grade + " grade and his ID is " + student1.id);
	}

}
