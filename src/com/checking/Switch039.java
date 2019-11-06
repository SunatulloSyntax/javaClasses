package com.checking;

import java.util.Scanner;

public class Switch039 {

	public static void main(String[] args) {

			   Scanner info;
			   String name;
			   
			   info = new Scanner(System.in);
			   
			   System.out.println("enter name of the instructor");
			   name = info.nextLine();
			   String statement1 = null;
			   String a;
			   switch(name) {
			     case "Shiva":
			       statement1 = " Java";
			       break;
			     case "Sandish":
			       statement1 = "SDLC";
			       break;
			     case "Weqas":
			       statement1 = "Selenium";
			       break;
			     case "Asel":
			       statement1 = "every";
			       break;
			     default:
			       System.out.println("asds");
			   
			       
			       System.out.println("Will take care of " + statement1 + "Assignment");
			       
			       
			   }
			   
			   
	}

}
