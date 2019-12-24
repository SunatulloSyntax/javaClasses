package com.class33;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
//		create linked list of String object
		LinkedList<String> ilist = new LinkedList<>();
		ilist.add("Hello");
		ilist.add("Bye");
		
		System.out.println(ilist.size());
		ilist.add("Hello1");
		ilist.add("Bye1");
		
//		retrieve
		System.out.println(ilist.get(1));
		
//		update/replace
		ilist.set(2, "Hi");
		System.out.println(ilist);
		
//		how to retrieve all values from linked list
	}
}
