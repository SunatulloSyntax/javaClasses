package com.ExercisesFromCodeDope;

public class Test5 {
	  int x; 
	  
	  // Constructor with a parameter
	  public Test5(int x) { 
	    this.x = x; 
	  } 
	  
	  void display() {
		    System.out.println("Value of x = " + this.x);

	  }

	  // Call the constructor
	  public static void main(String[] args)  { 
	    Test5 myObj = new Test5(5); 
	    myObj.display();
	  } 

}
