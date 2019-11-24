package com.checking;

public class Review {

		  
		  void time(int h, int m){
		  for (int i = 0; i <= 12; i++){
		    for(int j = 0; j <= 60; j++){
		      if(i == 11 && j == 30) {
		    	  System.out.println(h + ":" + m);
		      }
//		      System.out.println(i + " " + j);
		      
		    }
		  }
		  }
		    public static void main(String[] args){
		      Review t = new Review();
		      t.time(11,30);
		    }

		}