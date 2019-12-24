package exercises;

import java.util.*;

public class Map1 {

	public static  void Display(Map<String, Integer> map){
	    
	    if(map.isEmpty()){
	    	 System.out.println("map is empty");
	      }
	    
	    else{
	    	for(String set : map.keySet()) {
	    		System.out.println(set + " " + map.get(set));
	    	}
	    }
	  }
	  
	  public static void main(String[] args){
	  
	    Map<String, Integer> map1 = new HashMap<>();
	    map1.put("mango", 10);
	    map1.put("apple", 30);
	    map1.put("orange", 20);
	    Display(map1);
	    map1.clear();
	    Display(map1);
}
}