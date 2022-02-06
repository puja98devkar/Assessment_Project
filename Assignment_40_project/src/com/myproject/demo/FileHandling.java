package com.myproject.demo;
import java.io.File;
import java.io.IOException;
public class FileHandling {
	 public static void main(String[] args) {
		    try {
		      File file = new File("C:\\Users\\Suraj\\Downloads\\FileHandleling\\bin\\com\\mypackage\\filehandling");
		      /*If file gets created then the createNewFile() 
		          method would return true or if the file is 
		          already present it would return false */
		      boolean flag = file.createNewFile();
		      if (flag) {
		        System.out.println("File has been created successfully at the specified location");
		      }
		      else {
		        System.out.println("File already present at the specified location");
		      }
		    }
		    catch(IOException e) {
		      System.out.println("Exception Occurred:");
		      e.printStackTrace();
		    }
		  }
}
