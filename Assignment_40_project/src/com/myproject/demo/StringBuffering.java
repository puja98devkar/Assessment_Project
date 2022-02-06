package com.myproject.demo;

public class StringBuffering {
	 public static void concat1(String s1)
	    {
	        s1 = s1 + "itsmypackage";
	    }
	 
	    // Method 2
	    // Concatenates to StringBuilder
	    public static void concat2(StringBuilder s2)
	    {
	        s2.append("itsmypackage");
	    }
	 
	    // Method 3
	    // Concatenates to StringBuffer
	    public static void concat3(StringBuffer s3)
	    {
	        s3.append("itsmypackage");
	    }
	 
	    // Method 4
	    // Main driver method
	    public static void main(String[] args)
	    {
	        // Custom input string
	        // String 1
	        String s1 = "itsbuffring";
	 
	        // Calling above defined method
	        concat1(s1);
	 
	        // s1 is not changed
	        System.out.println("String: " + s1);
	 
	        // String 1
	        StringBuilder s2 = new StringBuilder("buffer:");
	 
	        // Calling above defined method
	        concat2(s2);
	 
	        // s2 is changed
	        System.out.println("StringBuilder: " + s2);
	 
	        // String 3
	        StringBuffer s3 = new StringBuffer("buffer:");
	 
	        // Calling above defined method
	        concat3(s3);
	 
	        // s3 is changed
	        System.out.println("StringBuffer: " + s3);
	    }

}
