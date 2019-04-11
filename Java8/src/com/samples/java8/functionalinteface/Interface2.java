package com.samples.java8.functionalinteface;

public interface Interface2 {
	
	public void display();
	
	default void move()
	{
		System.out.println("I am in Interface2");
	}

}
