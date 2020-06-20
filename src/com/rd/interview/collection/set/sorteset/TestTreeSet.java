package com.rd.interview.collection.set.sorteset;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * 
 * @author alok.kumar
 *
 *
 *         Java TreeSet class implements the Set interface that uses a tree for
 *         storage. Like HashSet, TreeSet also contains unique elements.
 *         However, the access and retrieval time of TreeSet is quite fast. The
 *         elements in TreeSet stored in ascending order.
 */
public class TestTreeSet {

	public static void main(String args[]) {

		//TreeSet<String> set = new TreeSet<String>();
		
		SortedSet<String> set = new TreeSet();  
		
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");
		set.add("Ajay");
		// traversing elements
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
