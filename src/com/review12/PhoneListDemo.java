package com.review12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PhoneListDemo {

	public static void main(String[] args) {
		List<Phone> phoneList = new ArrayList<>();
		System.out.println(phoneList.size());

		Phone phone1 = new Phone("123-123"); // creating an Object and assigning to the variable to the phone1

		phoneList.add(phone1);
		phoneList.add(new Phone("234-234"));

//		int size = phoneList.size();
//		System.out.println(size);

		System.out.println(phoneList.size());

		SmartPhone iphone1 = new SmartPhone("1234-567", "White");
//		Up Casting
//		Phone phone2 = iphone1;
//		phoneList.add(iphone2);

		phoneList.add(iphone1);
		phoneList.add(new SmartPhone("s00000", "Black"));

		System.out.println(phoneList.size());

//		Up Casting is done implicitly
		System.out.println("--- Up Casting ---");
		Phone thirdPhone = phoneList.get(2);
		thirdPhone.displayInfo();
		thirdPhone.call("345-678");

//		Down Casting should be done explicitly/manually/
		System.out.println("--- Down Casting ---");
		SmartPhone thirdSmartPhone = (SmartPhone) thirdPhone;
		thirdSmartPhone.showWeather();

		System.err.println("**** 1st Way ***");
		for (int i = 0; i < phoneList.size(); i++) {
			Phone phone = phoneList.get(i);
			phone.displayInfo();

//			check if the phone object is of type SmartPhone
			if (phone instanceof SmartPhone) {
//				it is safe to DOWNCAST

				SmartPhone sPhone = (SmartPhone) phone;
				sPhone.showWeather();
				sPhone.takePicture();
				System.out.println();
			}
		}

		System.err.println("--- 2nd Way ---");
		for (Phone phone : phoneList) {
			phone.displayInfo();
		}

		System.err.println("--- 3rd Way ---");
		Iterator<Phone> phoneIterator = phoneList.iterator();

//		Phone firstPhone = phoneIterator.next();
//		firstPhone.displayInfo();
//		
//		Phone secondPhone = phoneIterator.next();
//		secondPhone.displayInfo();

		while (phoneIterator.hasNext()) {
			Phone phone = phoneIterator.next();
			System.out.println();
			phone.displayInfo();

			if (phone instanceof SmartPhone) {
				SmartPhone sPhone = (SmartPhone) phone;
				sPhone.showWeather();
				sPhone.takePicture();
				System.out.println();

			}
		}
		System.err.println("--- Remove SmartPhones from list ---");
		Iterator<Phone> it = phoneList.iterator();
		while (it.hasNext()) {
				Phone phone = it.next();
//			it.next();
			if (phone instanceof SmartPhone) {
				it.remove();
			}
		}

		System.out.println(phoneList.size());

			for (int i = 0; i < phoneList.size(); i++) {
				Phone phone = phoneList.get(i);
				phone.displayInfo();
			}
	}
}
