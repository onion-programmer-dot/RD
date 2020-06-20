package com.rd.interview.java8.stream;

import java.util.stream.IntStream;

/**
 * 
 * @author alok.kumar
 *
 *	Find minimum in array using stream
 */
public class FindMinOfArray {

	public static void main(String[] args) {

		int [] arr ={3, 5, 2, 10, 9};
		
		IntStream.of(arr).min().ifPresent(min -> System.out.println(min));
		
		IntStream.of(arr).min().ifPresent(System.out::print);
		
		
		
		// find three minimum from the array
		// it internally create copy of the array does not mutate the original array 
		System.out.println("Get three min number from the array "+"\n");
		IntStream.of(arr)
		.distinct()
		.sorted()
		.limit(3)
		.forEach(i -> System.out.print(i +"\t"));
	}

}
