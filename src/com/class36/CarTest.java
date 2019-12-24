package com.class36;

import java.util.*;
import java.util.Map;
import java.util.Map.Entry;

// Create a car class that will have variables, methods
class Car {
	String make, model;

	public Car(String make, String model) {
		this.make = make;
		this.model = model;
	}

	public void display() {
		System.out.println(make + " -> " + model);
	}

	public String toString() {
		return make + " >>> " + model;
	}
}

public class CarTest {

	public static void main(String[] args) {

		Map<Integer, Car> mapCar = new LinkedHashMap<Integer, Car>();
		mapCar.put(1, new Car("BMW", "X5"));
		mapCar.put(2, new Car("Tesla", "S"));
		mapCar.put(3, new Car("Mercedes", "S5"));
		mapCar.put(4, new Car("Toyota", "Rav4"));
		mapCar.put(5, new Car("Honda", "Civic"));
		mapCar.put(2, new Car("Lincoln", "S"));

		System.out.println("--Printing size");
		System.out.println(mapCar.size());

		System.out.println("----Get Values ---> CAR");
		Collection<Car> coll = mapCar.values();

		System.out.println("---Using Enhanced for L00p");
		for (Car c : coll) {
			c.display();
		}

		System.out.println("--------Getting Entry");
//		map key to its corresponding values (entrySet or keySet)
		Set<Entry<Integer, Car>> set = mapCar.entrySet();
		System.out.println("--------Getting entry with Enhanced for loop");
		for (Entry<Integer, Car> ent : set) {
			Integer n = ent.getKey();
			Car c = ent.getValue();
			System.out.println("Key " + n + " is associated with value of " + c.toString());
//			c.display();
		}

//		using keyset to map keys to values
		System.out.println("--------Getting KEYS and VALUES using keySet");
		Set<Integer> keySet = mapCar.keySet();

		System.out.println("--------Using Enhanced for loop");
		for (Integer key : keySet) {
			Car car1 = mapCar.get(key);
			String carModel = mapCar.get(key).model;
			System.out.println(key + " ----- " + car1);
//		   System.out.println(carModel);
		}
		System.out.println();

//		use iterator to iterate through values, keySet, entrySet
		System.out.println("-----------------Using Iterator");
		
		Iterator<Entry<Integer, Car>> entryIterator = set.iterator();
		while (entryIterator.hasNext()) {
			Entry<Integer, Car> entry = entryIterator.next();
			Integer key = entry.getKey();
			Car car = entry.getValue();
			System.out.println(key + " -> " + car);
		}
	}
}
