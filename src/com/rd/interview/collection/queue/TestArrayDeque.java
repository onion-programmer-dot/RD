package com.rd.interview.collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 
 * @author alok.kumar
 *
 *         ArrayDeque class implements the Deque interface. It facilitates us to
 *         use the Deque. Unlike queue, we can add or delete the elements from
 *         both the ends.
 */
public class TestArrayDeque {

	public static void main(String[] args) {
		
		Deque<String> deque = new ArrayDeque<String>();  
		deque.add("Gautam");  
		deque.add("Karan");  
		deque.add("Ajay");  
		//Traversing elements  
		for (String str : deque) {  
		System.out.println(str);  
		}
	}

}
