package com.class17;

public class Computer1 {

	
		//define attributes/ features
		String monitor, name, brand;
		boolean keyboard, mouse;
		int memory, ram, size;
		double screen;
		
		//define behavior, actions
		void playGames(){  //method header
			//method body
			System.out.println("I can play on my " + name);
		}
		void javaCoding() {
			System.out.println("I can do Java coding on my " + name);
		}
		void watchMovie() {
			System.out.println("I can watch movie on my " + name);
		}
		///////////////////////////////////////////////////////////////////
		public static void main(String[] args) {
			Computer1 comp = new Computer1();
			comp.brand = "Dell";
			comp.name = "XPS 15";
			comp.memory = 500;
			
			System.out.println("I hava " + comp.brand + " " + comp.name );
			
			comp.playGames();
			comp.javaCoding();
			comp.watchMovie();
		}
		
	}


