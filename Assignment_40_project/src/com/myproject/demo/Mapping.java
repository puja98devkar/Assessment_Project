package com.myproject.demo;
import java.util.*;  
public class Mapping {
	public static void main(String args[]){  
		  Map<Integer,String> map=new HashMap<Integer,String>();  
		  map.put(100,"neha");  
		  map.put(101,"sonu");  
		  map.put(102,"rani");  
		  //Elements can traverse in any order  
		  for(Map.Entry m:map.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		 } 
}
