package com.samples.java8.functionalintefaceImpl;

import com.samples.java8.functionalinteface.Interface1;
import com.samples.java8.functionalinteface.Interface2;

public class InterfaceImpl implements Interface1,Interface2{

	@Override
	public void display() {
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		Interface1.super.move();
	}

}
