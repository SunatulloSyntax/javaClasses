package com.class21;

public class Ans {

	public static void main(String[] args) {
		Employee a =  new Employee();
		Employee b = new Employee();
		Employee c = new Employee();
		
		
		a.eID = 123132;
		a.salary = 1231231;
		
		b.eID = 123124324;
		b.salary = 3425435;
		
	    a.printInfo();
	    b.printInfo();
	    c.printInfo();

	    System.out.println("\n" + "\n ");
		
//		System.out.println(" Name" + "   \tYear of Joining " + " \tAdress");
//		System.out.println(r.name + "  \t" +r.yearOfJoining + "       \t" + r.adress); 
//		System.out.println(s.name + "     \t" +s.yearOfJoining + "      \t" + s.adress); 
//		System.out.println(j.name + "     \t" +j.yearOfJoining + "       \t" + j.adress); 
		Students s1 = new Students();
		Students s2 = new Students();
		Students s3 = new Students();
		
		s1.name = "Ali";
		s1.ID = 23;
		Students.numOfStudents++;
//		System.out.println("The total number of students is " + s1.numOfStudents);
		
		s2.name = "Vali";
		s2.ID = 43;
		Students.numOfStudents++;
//		System.out.println("The total number of students is " + s2.numOfStudents);

		
		s3.name = "Halid";
		s3.ID = 54;
		Students.numOfStudents++;
		System.out.println("The total number of students is " + 		Students.numOfStudents);

		
		
	}

}
