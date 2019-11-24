package com.class22;

public class Forest {
	 //Create four classes: Forest, Wolf, Fox, Bear
    //Class wolf has: color, age, numberOfWolves
    //Class fox has: color, speed, numberOfFoxes
    //Class bear has: type, weight, numberOfBears
    
    //Forest has main method
    //Create different objects/instances of different classes
    //At the end, print the total for each animal.

	public static void main(String[] args) {
		Wolf w1 = new Wolf();
		w1.color = "grey";
		w1.age = 3;
		Wolf.numberOfWolves++;
		
		Wolf w2 = new Wolf();
		w2.color = "white";
		w2.age = 4;
		Wolf.numberOfWolves++;
		
		Wolf w3 = new Wolf();
		w3.color = "black";
		w3.age = 5;
		Wolf.numberOfWolves++;
		
		w1.printInfo();
		w2.printInfo();
		w3.printInfo();
		System.out.println("The total number of wolves are " + Wolf.numberOfWolves);

		
		
		Fox f1 = new Fox();
		f1.color = "yellow";
		f1.speed = "12 m/h";
		Fox.numberOfFoxes++;
		
		Fox f2 = new Fox();
		f2.color = "grey";
		f2.speed = "10 m/h";
		Fox.numberOfFoxes++;
		
		f1.printInfo();
		f2.printInfo();
		System.out.println("The number of foxes are " + Fox.numberOfFoxes);
		
		
		Bear b1 = new Bear();
		b1.type = "little panda";
		b1.weight = "20 kg";
		Bear.numberOfBears++;
		
		Bear b2 = new Bear();
		b2.type = "big panda";
		b2.weight = "30";
		Bear.numberOfBears++;
		
		Bear b3 = new Bear();
		b3.type = "Grey big bear";
		b3.weight = "90 kg";
		Bear.numberOfBears++;
		
		b1.printInfo();
		b2.printInfo();
		b3.printInfo();
		System.out.println("The total number of bears is " + Bear.numberOfBears);

		
	}

}
