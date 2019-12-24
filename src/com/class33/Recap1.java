package com.class33;

import java.util.*;
import java.util.Iterator;
import java.util.List;

public class Recap1 {

	
	public static void main(String[] args) {
		
		int a; 
		a = 10;
		
		int b = 20;
		
		Student s1 = new Student("Salim", 107);
		
		List<Student> list = new ArrayList<>();
		list.add(s1);
		
		list.add(new Student("Zeynep", 108));
		list.add(new Student("Hasan", 109));
		list.add(new Student("Jaime", 110));
		list.add(new Student("Esra", 111));
		list.add(new Student("Ozlem", 112));
		
		Iterator<Student> it = list.iterator();
		while(it.hasNext()) {
//			Student st = it.next();
//			System.out.println(st.name);
//			System.out.println(it.next().display());
			it.next().display();
		}
	
		   ArrayList<Boolean> ListA = new ArrayList<>();
		  ListA.add(true);
		  ListA.add(false);
		  ListA.add(false);
		  
		  ArrayList<Boolean> b1 = new ArrayList<>();
		  b1.addAll(ListA);
		  b1.addAll(ListA);
		  System.out.println(b1);

		  
		 
	}
}
