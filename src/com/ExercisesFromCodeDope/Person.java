package com.ExercisesFromCodeDope;

public class Person {
	
	    Person() 
	    { 
	        System.out.println("Person class Constructor"); 
	    } 
	} 
	  
	/* subclass Student extending the Person class */
	class Studen extends Person 
	{ 
	    Studen() 
	    { 
	        // invoke or call parent class constructor 
//	        super(); 
	  
	        System.out.println("Student class Constructor"); 
	    } 
	} 
	  
	/* Driver program to test*/
	class Tes 
	{ 
	    public static void main(String[] args) 
	    { 
	        Studen s = new Studen(); 
	    } 
	} 


