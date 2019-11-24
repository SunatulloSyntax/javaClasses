package review9;

//Create a SuperCar class.
//It should have at least 10 variables, like: make, brand, year, manifacture
//Create at least 4 Constructors with different number of parameters.

public class ConstuctorsDemo {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.displayInfo();
		
		car1.make = "Honda";
		car1.color = "white";
		
		System.out.println();
		
		Car car2 = new Car("Toyota");
		car2.color = "Grey";
		car2.displayInfo();
		
		System.out.println();
		
		Car car3 = new Car("Jeep", "Blue");
		car3.displayInfo();
		
	}

}
