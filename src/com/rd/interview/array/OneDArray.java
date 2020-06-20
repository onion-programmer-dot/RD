package com.rd.interview.array;

import java.util.Scanner;

public class OneDArray {

	 public static boolean canWin(int leap, int[] game) {
	        // Return true if you can win the game; otherwise, return false.
		 boolean result = false ;
		 int size = game.length;
		 
		 for(int i=0; i < size; i++){
			 
			 if(i == size-1){
				 return true;
			 }
			 
			 
			 if(game[i+1] == 1){
				 
				 if(size > leap + i+1 && game[i+ leap] == 0 ){
					 i = i + 3;
					 
				 }else{
					 return false;
				 }
			 }
		 }
			 
		 return result;
	    }

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int q = scan.nextInt();
	        while (q-- > 0) {
	            int n = scan.nextInt();
	            int leap = scan.nextInt();
	            
	            int[] game = new int[n];
	            for (int i = 0; i < n; i++) {
	                game[i] = scan.nextInt();
	            }

	            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
	        }
	        scan.close();
	    }

}
