package com.samples.java8.methodReference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MethodReferenceSample {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Sarala","Maha","Neha","Madhuri");
		Collections.sort(list);
		list.forEach(System.out::println);
		
		
	}

}
