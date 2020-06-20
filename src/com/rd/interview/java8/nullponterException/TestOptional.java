package com.rd.interview.java8.nullponterException;

import java.util.Optional;

public class TestOptional {

	public static void main(String[] args) {
		// Optional 
		Optional<String> s1 =Optional.empty();
		
		s1.get().equals("a");
		
		System.out.println("No null pointer exception");
		
		/*String s = null;
		
		s.equals("a");*/
		
		
	}

}
