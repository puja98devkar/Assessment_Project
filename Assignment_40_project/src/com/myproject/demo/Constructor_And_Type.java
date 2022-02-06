package com.myproject.demo;

public class Constructor_And_Type {
	
		  int modelYear;
		  String modelName;

		  public Constructor_And_Type (int year, String name) {
		    modelYear = year;
		    modelName = name;
		  }

		  public static void main(String[] args) {
			  Constructor_And_Type myCar = new Constructor_And_Type(1969, "Mustang");
		    System.out.println(myCar.modelYear + " " + myCar.modelName);
		  }
		}


