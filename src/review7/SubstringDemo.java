package review7;

public class SubstringDemo {

	public static void main(String[] args) {
		String longStr = "I Am very happy today, because today is not Monday";
		String anotherStr = longStr.substring(9);
		System.out.println(anotherStr);
		
		System.out.println(longStr.length());
		anotherStr = longStr.substring(10,50);
		System.out.println(anotherStr);
		System.out.println("********************");
		
	    anotherStr = longStr.replace('a', 'o').replace('A', ' ');
	    System.out.println(anotherStr);
		System.out.println("---------------------");
		
		anotherStr = longStr.replace("today", "tomorrow");
		System.out.println(anotherStr);
		
		anotherStr = longStr.replace(",", "");
		System.out.println(anotherStr);
		
		
		
		
	}

}
