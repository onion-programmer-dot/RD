package com.rd.interview.java8.lamda;

import java.util.ArrayList;
import java.util.List;

public class PrintArraylist {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		// list created and added 1 to 5 value into this
		
		// print the list using lambda expression java 8
		
		list.forEach(i -> System.out.print("\t" +i));
	}

}
