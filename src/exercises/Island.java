package exercises;

import java.util.*;

public class Island {
	
	  
	  public static void main(String[] args) {
	    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
	    desertIslandPlaylist.add("AKon - Na Na Na");
	    desertIslandPlaylist.add("Arash - Devushka");
	    desertIslandPlaylist.add("Shabnam - Biyo");
	    desertIslandPlaylist.add("Sadriddin - Oshikam");
	    desertIslandPlaylist.add("Mirshary Rashid - Surah Rahman");
	  
	    
	    System.out.println(desertIslandPlaylist);
	    System.out.println(desertIslandPlaylist.size());
	    desertIslandPlaylist.remove("Arash - Devushka");
	        System.out.println(desertIslandPlaylist.size());
	        int indexA = desertIslandPlaylist.indexOf("Mirshary Rashid - Surah Rahman");
	        int indexB = desertIslandPlaylist.indexOf("Shabnam - Biyo");
	        
	        String tempA = "Mirshary Rashid - Surah Rahman";  //A
	        
	        desertIslandPlaylist.set(indexA, "Shabnam - Biyo");  //B
	        // System.out.println(desertIslandPlaylist);
	        desertIslandPlaylist.set(indexB, tempA);
	        System.out.println(desertIslandPlaylist);
	  }
	  
	  
	  
	  
	}

