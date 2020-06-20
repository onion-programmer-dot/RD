package com.rd.interview;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regextest {

	public static void main(String[] args) {

	/*	3
		([A-Z])(.+)
		[AZ[a-z](a-z)
		batcatpat(nat*/
				
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		int testCases = Integer.parseInt(s.trim());
		while(testCases>0){
			String pattern = in.nextLine();
            try{
                Pattern.compile(pattern);
                System.out.println("Valid");
            }catch(Exception e){
                System.out.println("Invalid");
            }
            testCases--;
		}
		

	}

}
