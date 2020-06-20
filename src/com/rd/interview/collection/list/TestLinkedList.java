package com.rd.interview.collection.list;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * 
 * @author alok.kumar
 *
 *
 *         LinkedList implements the Collection interface. It uses a doubly
 *         linked list internally to store the elements. It can store the
 *         duplicate elements. It maintains the insertion order and is not
 *         synchronized. In LinkedList, the manipulation is fast because no
 *         shifting is required.
 */
public class TestLinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();  
		ll.add("Ravi");  
		ll.add("Vijay");  
		ll.add("Ravi");  
		ll.add("Ajay");  
		Iterator<String> itr = ll.iterator();  
		while(itr.hasNext()){
			
			System.out.println(itr.next());  
	
		}  
		
		
	}

}
