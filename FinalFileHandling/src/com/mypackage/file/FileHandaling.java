package com.mypackage.file;

import java.util.Scanner;
public class FileHandaling {
	public static void main(String[] args){
		String Filename,Content;
		int No;
		Scanner OperationNo = new Scanner(System.in);
		Scanner FileNameInput=new Scanner(System.in);
		Scanner ContentInput=new Scanner(System.in);
	    System.out.println("Please enter Operation \n");
	    System.out.println("1.Create File\n");
	    System.out.println("2.Write File\n");
	    System.out.println("3.Read File\n");
	    System.out.println("4.Append File\n");
	    System.out.println("5.Exit File\n");
	    try{
	    	No= OperationNo.nextInt();
	    	if(No<5){
	    		System.out.println("Please Enter Filename\n");
	    		Filename=FileNameInput.nextLine();
	    		try {
	    			FileOperation fileOperation=new FileOperation();
	    			switch (No){
	    			case 1:
	    				fileOperation.createNewFile(Filename);
	    				break;
	    			case 2:
	    				System.out.println("Please Enter Content\n");
	    				Content=ContentInput.nextLine();
	    				fileOperation.writefile(Filename,Content);
					    break;
	    				
	    			case 3:
	    				fileOperation.readFile(Filename);
	    				break;
	    			
				    case 4:
					    System.out.println("Please Enter Content\n");
					    Content=ContentInput.nextLine();
					    fileOperation.appendFile(Filename, Content);
					    break;
				    case 5:
					    System.out.println("exit");
					    System.exit(0);
					    break;
				        default:
					    throw new Exception();
				    } 
			    }
	    		catch(Exception e){
	    			System.out.println( "Please give input no less than or equal to 5");
	    			}
	      }
	    	else{
	    		System.out.println("exit from the loop");
	    	}
	    	if (No!=5)
	    		main(new String[] { "" });
	   }
	    catch(Exception ex){
          System.out.println("Please give input in the form of no");
		  main(new String[] { "" });
		}		
	}
}

