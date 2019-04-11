package com.samples.java8.functionalintefaceImpl;

import com.samples.java8.functionalinteface.FuntionalInterfaceExample;

public class FuntionalInterfaceImpl implements FuntionalInterfaceExample{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		FuntionalInterfaceExample.super.move();
		System.out.println("Hello from impl");
	}
	
	public static void main(String[] args) {
		
		FuntionalInterfaceImpl  funtionalInterfaceImpl = new  FuntionalInterfaceImpl();
		funtionalInterfaceImpl.move();
		FuntionalInterfaceExample.show();
	}

}
