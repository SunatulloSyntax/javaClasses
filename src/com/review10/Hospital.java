package com.review10;

public class Hospital {
	public static void main(String[] args) {
		Doctor d1 = new Doctor("John", "Family Doctor", 123456);
		//d1.name = "John";
		//d1.specialty = "Family Doctor";
		//d1.licenced = 123456;
		
		d1.displayInfo();
		d1.chekUp("Adam");
		d1.chargePatient();
		
		System.out.println("-------Doctor 2---------");
		Doctor d2 = new Doctor("James", "Eye Doctor", 1234567, "123 Main st. ", "Sunday");
//		d2.chargePatient();
		d2.displayInfo();
		
		System.out.println("---------Dermotologist------------");
		Dermatologist d3 = new Dermatologist("Emily", "Dermatologist", 324235);
		d3.displayInfo();
		d3.chekUp("Anna");
		d3.applySkinTreatment();
//		d2.applySkinTreatment();  >>> Not applicable for normal doctor
		
		System.out.println("------Create ENT Doctor");
		ENT d4 = new ENT("Bulent", "ENT", 1243325345);
		d4.displayInfo();
		d4.chargePatient();
		d4.chekUp("Mehmet");
		
		System.out.println("---------Polymorphysm-----------");
		Doctor d5;
		d5 = new ENT("Oz", "ENT", 7566352);
		
		Dermatologist d6 = new Dermatologist("Wang", "Dermatologist", 7546354);
		Doctor d7 = d6;
		
//		int[] ints = new int[5];
		Doctor[] doctors = new Doctor[5];
		doctors[0] = d1;
		doctors[1] = d2;
		doctors[2] = d3;
		doctors[3] = d4;
		doctors[4] = d5;
		System.out.println("-----1st way------");
		for(int i = 0; i < doctors.length; i++) {
			Doctor d = doctors[i];
			d.displayInfo();
			d.chargePatient();
		}
		
		System.out.println("-----2nd way------");
		for(Doctor doc : doctors) {
			doc.displayInfo();
			doc.chargePatient();
		}
		
	}
}
