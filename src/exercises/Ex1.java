package exercises;

import java.util.*;

public class Ex1 {
	public static void main(String[] args) {
		  Map<Integer, Double> map = new TreeMap<>();
		    map.put(1, 1.1);
		    map.put(2, 2.2);
		    map.put(3, 3.3);
		    map.put(4, 4.4);
		    map.put(5, 5.5);
		    
		    System.out.println(map.containsKey(3));
	}
}
