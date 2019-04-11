package com.samples.java8.functionalinteface;

@FunctionalInterface
public interface FuntionalInterfaceExample {
	
	public void display();
	
	//public void display1();
	
	@Override
	boolean equals(Object obj);
	default void move(){
        System.out.println("I am moving");
    }
	
	default void move1(){
        System.out.println("I am moving");
    }
	
	static void show() 
    { 
        System.out.println("Static Method Executed"); 
    } 
	

}
