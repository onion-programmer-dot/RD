package com.rd.interview.array;

public class SubArrayNegativeSumCount {

	public static void main(String[] args) {
		
		int arr[] = {1, -2, 4, -5, 1};//{1,2,3};
		
		// print all possible sub array
		int sum = 0;
		int countNegativeSum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				for (int k = i; k <= j; k++) {
					sum = sum + arr[k];
					
				}
				
				if(sum < 0){
					countNegativeSum++;
					sum =0;
				}
			}
		}
		System.out.println("-ve sum "+ countNegativeSum);
	}

}
