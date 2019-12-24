package com.ExercisesFromCodeDope;

public class Super_Test {
	
	    Super_Test(){
	        System.out.println("This is super class, no object is created");
	    }
	}
	class Super_sub extends Super_Test{
	    Super_sub(){
	       super();
	       System.out.println("This is sub class, object is created");
	    }
	}
	  


