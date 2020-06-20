package com.rd.interview.string;

public class NoOfSubString {

	public static void main(String[] args) {
		
		String s = "welcometojava";
		int k = 3;
		// testing code 
			//System.out.println(s.substring(0,3));
		// end testing
		String smallestAndLargest = getSmallestAndLargest(s, k);
		System.out.println(smallestAndLargest);
			//test(s, k);
	}
	
	public static String getSmallestAndLargest(String s, int k) {
	    String smallest = "";
	    String largest = "";
	    smallest = largest = s.substring(0, k);

	    for (int i=1; i<s.length()-k+1; i++) {
	        String substr = s.substring(i, i+k);
	        if (smallest.compareTo(substr) > 0)
	            smallest = substr;
	        if (largest.compareTo(substr) < 0)
	            largest = substr;
	    }

	    return smallest + "\n" + largest;
	}
	
	public static String test(String s, int k) {
	    String smallest = "";
	    String largest = "";
	    smallest = largest = s.substring(0, k);

	    for (int i=1; i<s.length()-k+1; i++) {
	        String substr = s.substring(i, i+k);
	        
	      // System.out.println(substr);
	        /*if (smallest.compareTo(substr) > 0)
	            smallest = substr;
	        if (largest.compareTo(substr) < 0)
	            largest = substr;*/
	    }

	    return smallest + "\n" + largest;
	}
}
