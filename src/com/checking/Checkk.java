package com.checking;
class Addition { 
    
    int sum = 0; 
      
    public int addTwoInt(int a, int b){ 
          
        // adding two integer value. 
        sum = a + b; 
          
        //returning summation of two values. 
        return sum;  
//        System.out.println(sum);
    }
    
    
      
} 
public class Checkk {

	public static void main(String[] args) {
		

		// creating an instance of Addition class  
        Addition add = new Addition(); 
          
        // calling addTwoInt() method to add two integer using instance created 
        // in above step. 
        int s = add.addTwoInt(1,2); 
        System.out.println("Sum of two integer values :"+ s); 
        System.out.println("----------------------");
        
        
        
        String str = "hello Dear, how are you, how you been?";
        System.out.println(str);
        
        
        System.out.println(str.replace('h','H'));  // ony change h to H
        System.out.println(str.replaceAll("Dear","My Friend"));  // it changes a word
		}
	
}
