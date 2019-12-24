package com.review12;

import java.util.*; // to import all(ArrayList, LinkedList, List...)

public class WrapperDemo {

	public static void main(String[] args) {
//		int -> Integer
//		double -> Double
//		boolean -> Boolean

//		Boxing
		Integer i1 = new Integer(3);

//		Auto-boxing
		Integer i2 = 5;

//		Un-boxing
		int primitiveInt1 = i1.intValue();

//		Auto-unboxing
		int primitiveInt2 = i1;

		List<Integer> integers = new ArrayList<>();
//		integers.add("Integer");
		integers.add(new Integer(5));
		integers.add(4);
		integers.add(5);		
		integers.add(2);
		
		
		
//		integers.remove(1);
		System.out.println(integers.size());
		
		System.err.println("---LIST Example ---");
		Iterator<Integer> iterator = integers.iterator();
		while(iterator.hasNext()) {
//			auto unboxing
			int el = iterator.next();
			System.out.println(el);
		}
		
		System.err.println("--- SET Example---");
		System.err.println("--- There is no index in SET");
		Set<Integer> integerSet = new HashSet<Integer>();
		integerSet.add(5);
		integerSet.add(4);
		integerSet.add(5);
		integerSet.add(2);
		integerSet.add(2);
		
		
		
//		integerSet.remove(4);
		
		Iterator<Integer> iteratorSet = integerSet.iterator();
		while(iteratorSet.hasNext()) {
//			auto unboxing
			int el = iteratorSet.next();
			System.out.println(el);
		}
		
	
	}
}
