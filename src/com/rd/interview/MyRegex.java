package com.rd.interview;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyRegex {

	public static void main(String args[]){
		
	/*	000.12.12.034
		121.234.12.12
		23.45.12.56
		00.12.123.123123.123
		122.23
		Hello.IP*/
		
		
	}
	private boolean checkIp(String ip){
	
		String zeroTo255 
        = "(\\d{1,2}|(0|1)\\"
          + "d{2}|2[0-4]\\d|25[0-5])"; 
		
		String regex 
        = zeroTo255 + "\\."
          + zeroTo255 + "\\."
          + zeroTo255 + "\\."
          + zeroTo255; 
		
		 Pattern p = Pattern.compile(regex); 
		 Matcher m = p.matcher(ip);
		 
		 return m.matches(); 
	}
}
