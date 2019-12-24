package com.ExercisesFromCodeDope;

public class CellPhone {
	
	    public void print() {
	        System.out.println("I'm a cellphone");
	    }
	}

	 class TouchPhone extends CellPhone {
	    @Override
	    public void print() {
	        super.print();
	        System.out.println("I'm a touch screen cellphone");
	    }
	    
	}


