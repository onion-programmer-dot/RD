package com.rd.interview;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {

		String s1 ="Hello";
		String s2 = "hello";
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		char []arrS1 = s1.toCharArray(); 
        Arrays.sort(arrS1); 
        
        char []arrS2 = s2.toCharArray(); 
        Arrays.sort(arrS2); 
        
        boolean equals = Arrays.equals(arrS1, arrS2);
        if(equals){
        	System.out.println("Anagrams");
        }
        
		
	}

}
