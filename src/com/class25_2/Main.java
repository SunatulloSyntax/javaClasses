package com.class25_2;

public class Main {
	
	public static void main(String[] args) {
	      Main blancket = new Main("Blancket" , 49.99, 2);
	      Main mattress = new Main("Mattress" , 219.59, 2);
	      blancket.itemTotalPrice();
	      mattress.itemTotalPrice();
	      System.out.println("You purchased " + 539.16 + " Today");
	      
	      // Main mattress = new Main("Mattress" , 219.59, 2);
	      // mattress.itemTotalPrice();
	      
	      //Complete the Application
	  }
	  
	  String item;
	   double price;
	   int quantity;
	  
	  Main(String item, double price, int quantity){
	    this.item = item;
	    this.price = price;
	    this.quantity = quantity;
	  }
	  
	  
	  double itemTotalPrice(){
	    System.out.println(item + " Total Value " + price*quantity);
	    return price*quantity;
	  }
		}

