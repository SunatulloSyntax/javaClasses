package com.review13;

import java.util.*;

public class Countries {

	public static void main(String[] args) {
		
		List<String> asia = new ArrayList<String>();
		asia.add("--- A S I A ---");
		asia.add("Tajikistan");
		asia.add("Uzbekistan");
		asia.add("Kyrgyzstan");
		asia.add("Afganistan");
		
		List<String> europe = new ArrayList<String>();
		europe.add("--- E U R O P E ---");
		europe.add("Albania");
		europe.add("Germany");
		europe.add("Spain");
		europe.add("France");
		
		List<String> africa = new ArrayList<String>();
		africa.add("--- A F R I C A ---");
		africa.add("Nigeria");
		africa.add("Ethiopia");
		africa.add("Egypt");
		africa.add("Tanzania");
		
		List<String> america = new ArrayList<String>();
		america.add("--- A M E R I C A ---");
		america.add("Canada");
		america.add("Mexico");
		america.add("USA");
		america.add("Cuba");
		
		List<List<String>> world = new ArrayList<>();
		world.add(asia);
		world.add(europe);
		world.add(africa);
		world.add(america);
		
		for(List<String> continents : world) {
//			System.out.println(continents);
		
		Iterator<String> iteratorOfContinents = continents.iterator();
		while(iteratorOfContinents.hasNext()) {
			String countries = iteratorOfContinents.next();
			System.out.println(countries);
		}System.out.println();
	}
}
}
