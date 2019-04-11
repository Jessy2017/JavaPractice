package com.samples.overriding;

public class Parent {
	
	private void show()
	{
		System.out.println("I am in parents show");
	}
	
	 void display()
	{
		 show();
		System.out.println("Hi frim Parent");
	}
	 
	 public static void staticMethod()
	 {
		 System.out.println("i am in staic parent class");
	 }
	 
	 public final void finalMethod()
	 {
		 System.out.println("Final method in parent class");
	 }
	 
	 public void exceptionsInInheritence()
	 {
		 System.out.println("I am parent exceltion method");
	 }

}
