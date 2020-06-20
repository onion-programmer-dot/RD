package com.rd.interview;

public class SubstringComparisons {

	public static void main(String[] args) {
		
		String s = "hello";
		SubstringComparisons obj = new SubstringComparisons();
		boolean alpha = obj.isAlpha(s);
		System.out.println(alpha);
	}

	public boolean isAlpha(String name) {
	    return name.matches("[a-zA-Z]+");
	}
}
