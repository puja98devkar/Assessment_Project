package com.myproject.demo;


interface DemoInterface  
{   
//default method   
default void display()   
{   
System.out.println("The dispaly() method invoked");   
}   
}   
//interface without default method  
interface DemoInterface1 extends DemoInterface  
{   
      
}   
//interface without default method  
interface DemoInterface2 extends DemoInterface  
{  
      
}   
//implementation class code   
public class DemoClass implements DemoInterface1, DemoInterface2  
{   
public static void main(String args[])   
{   
DemoClass obj = new DemoClass();   
//calling method  
obj.display();   
}   
}