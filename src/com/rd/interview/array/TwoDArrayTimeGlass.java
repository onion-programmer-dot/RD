package com.rd.interview.array;

import java.util.Scanner;

public class TwoDArrayTimeGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("test    =  "+2 % 4);
		
		int[][] arr = new int[6][6];

		final Scanner scanner = new Scanner(System.in);
		
        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        scanner.close();
        
       /* 
		int sum;
		int maxi = -100000;
		int x = 0;
		int y = 0;
		for (int k = 1; k <= 16; k++) {

		    sum = arr[y][x] + arr[y][x + 1] + arr[y][x + 2]
		            + arr[y + 1][x + 1]
		            + arr[y + 2][x] + arr[y + 2][x + 1] + arr[y + 2][x + 2];
		    x++;

		    if ((k % 4 == 0)) {
		            x = 0;
		            y++;
		    }

		    if(sum > maxi)
		            maxi  = sum; 
		}
		System.out.println(maxi);*/

		
		

	}

}
