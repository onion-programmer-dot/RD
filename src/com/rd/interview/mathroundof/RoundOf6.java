package com.rd.interview.mathroundof;

import java.text.DecimalFormat;

public class RoundOf6 {
	
	public static void main(String args[]){
	
		int x =2, y=7;
		//double d = 4.23;
		DecimalFormat df = new DecimalFormat("#.000000");
        
		double d = (double)x/y;
        System.out.println(df.format(x/y));
        
        System.out.println(df.format(d));
        
		System.out.println(x/y);
		
		
		
		System.out.println( padLeftSpaces("odoinjava", 20) );
		System.out.println(padLeftSpaces("howtodoinjava", 20) );
		System.out.println(padLeftSpaces("njava", 20));
		
		
	}
	 public static String padLeftSpaces(String str, int n) {
		    return String.format("%1$" + n + "s", str);
		  }
	 
	
	
	

}
