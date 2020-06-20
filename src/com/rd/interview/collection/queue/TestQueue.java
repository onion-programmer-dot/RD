package com.rd.interview.collection.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * 
 * @author alok.kumar
 *
 *
 *         The PriorityQueue class implements the Queue interface. It holds the
 *         elements or objects which are to be processed by their priorities.
 *         PriorityQueue doesn't allow null values to be stored in the queue.
 *                                           
 *
 *         Methods::
 *         1. add()- This method is used to add elements at the tail of queue.
 *         More specifically, at the last of linked-list if it is used, or
 *         according to the priority in case of priority queue implementation.
 *         
 *         2.	peek()- This method is used to view the head of queue without
 *         removing it. It returns Null if the queue is empty.
 *         
 *         3.	element()- This method is similar to peek(). It throws NoSuchElementException when
 *         the queue is empty.
 *         
 *         4.	remove ()- This method removes and returns the
 *         head of the queue. It throws NoSuchElementException when the queue is
 *         empty. 
 *         
 *         5.	poll()- This method removes and returns the head of the queue.
 *         It returns null if the queue is empty.
 *         
 *          
 *         6.	size()- This method return the
 *         no. of elements in the queue.
 * 
 * 
 */
public class TestQueue {

	public static void main(String[] args) {

		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Amit Sharma");
		queue.add("Vijay Raj");
		queue.add("JaiShankar");
		queue.add("Raj");
		
		
		System.out.println("head:" + queue.element());
		System.out.println("head:" + queue.peek());
		System.out.println("iterating the queue elements:");
		
		
		Iterator itr = queue.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		queue.remove();
		queue.poll();
		System.out.println("after removing two elements:");
		Iterator<String> itr2 = queue.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

	}

}
