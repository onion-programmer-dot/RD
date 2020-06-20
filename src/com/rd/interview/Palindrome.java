package com.rd.interview;

import java.util.Scanner;

public class Palindrome {

	public Palindrome() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		//Scanner sc = new Scanner(System.in);
		String A = "java";//sc.next();
		if (A.length() > 50) {
			return;
		}
		/* Enter your code here. Print output to STDOUT. */
		int div = A.length() / 2;
		int i, j = 0;
		j = A.length() - 1;
		boolean yes = true;
		for (i = 0; i <= div; i++) {
			
			//System.out.println(i +"  "+ j);
			//System.out.println(A.charAt(i) +"  "+ A.charAt(j));
			if (A.charAt(i) != A.charAt(j)) {
				System.out.println("No");
				yes = false;
				break;
			}
			j--;
			
		}
		if(yes)
			System.out.println("Yes");
	}
}
