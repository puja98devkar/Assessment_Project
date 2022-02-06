package com.myproject.demo;

public class Return_type_4 {
	
		 int square(int num){
		   return num * num; // return a square value.
		 }
		 public static void main(String[] args) 
		 {
		 // Create an obejct of class Test.
			 Return_type_4 t = new Return_type_4();
		   
		 // Call the method using object reference variable. Since the return type of this method is int, we will store it using a variable of type int.  
		    int squareOfNumber = t.square(20); 
		  
		 // Displaying the result.    
		    System.out.println("Square of 20: " +squareOfNumber);
		   }

}
