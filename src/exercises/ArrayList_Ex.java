package exercises;

import java.util.*;

public class ArrayList_Ex {

//	How  can  you  remove  all  duplicates  from
//	ArrayList?

	public static void main(String[] args) {
		List<String> aList = new ArrayList<>();
		aList.add("John");
		aList.add("Jane");
		aList.add("James");
		aList.add("Jasmine");
		aList.add("Jane");
		aList.add("James");
		
		Set<String> setList = new TreeSet<>(aList);
		System.out.println(setList);

	}

}
