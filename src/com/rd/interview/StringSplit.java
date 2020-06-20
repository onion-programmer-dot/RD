package com.rd.interview;

import java.util.regex.Pattern;

public class StringSplit {

	public static void main(String[] args) {
	//	String s = "He is a very very good boy, isn't he?";
		String s = "YES      leading spaces        are valid,    problemsetters are         evillllll";
		s = s.trim();
		
		// is composed of any of the following: English alphabetic letters, blank spaces, 
		//exclamation points (!), commas (,), question marks (?), periods (.), underscores (_), apostrophes ('), and at symbols (@).
		String delimiters = "\\s+|,\\s*|\\.\\s*";

	      // analyzing the string 
	    String[] split = s.split("[ !,?._'@]+");
		
		System.out.println(split.length);
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
		
		Pattern compile = Pattern.compile(delimiters);
		System.out.println("==="+compile.flags());

	}

}
