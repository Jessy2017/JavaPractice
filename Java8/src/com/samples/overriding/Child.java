package com.samples.overriding;

public class Child extends Parent{
	
	
	//#Rule1 Private methods cannot be overridden
	private void show()
	{
		System.out.println("I am in child show");
	}
	
	public static void staticMethod()
	{
		System.out.println("i am in static child class");
	}
	
	/* final methods can not be override
	 * public void finalMethod() {
	 * 
	 * }
	 */
	
	@Override
	void display() {
		// TODO Auto-generated method stub
		show();
		System.out.println("Hi from Child");
	}
	
	//overriding method must have same return type of subclass type
	/*
	 * @Override int display() { // TODO Auto-generated method stub show();
	 * System.out.println("Hi from Child"); }
	 */
	
	
	/*
	 * @Override public void exceptionsInInheritence() throws ArithmeticException,
	 * InterruptedException{ int n = 9/0; Thread.sleep(100); }
	 */
	
	public static void main(String[] args) {
		
		Parent parent = new Child();
		//parent.display();
		Parent.staticMethod();
		parent.staticMethod();
		
		
	}

}
