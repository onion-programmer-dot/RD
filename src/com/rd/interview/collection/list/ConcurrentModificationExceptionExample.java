package com.rd.interview.collection.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentModificationExceptionExample {

	public static void main(String args[]) {
	
		// Concurrent exception list
		try{
		// List<String> myList = new ArrayList<String>();
		 List<String> myList = new CopyOnWriteArrayList<String>();  // Avoid ConcurrentModificationException 

		myList.add("1");
		myList.add("2");
		myList.add("3");
		myList.add("4");
		myList.add("5");

		Iterator<String> it = myList.iterator();
		while (it.hasNext()) {
			String value = it.next();
			System.out.println("List Value:" + value);
			if (value.equals("3"))
				myList.remove(value);
		}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		//concurent Exception map
		
		//Map<String, String> myMap = new HashMap<String, String>();
		Map<String, String> myMap = new ConcurrentHashMap<String, String>();

		myMap.put("1", "1");
		myMap.put("2", "2");
		myMap.put("3", "3");

		Iterator<String> it1 = myMap.keySet().iterator();
		while (it1.hasNext()) {
			String key = it1.next();
			System.out.println("Map Value:" + myMap.get(key));
			if (key.equals("2")) {
				myMap.remove(key);
			}
		}

	}
}
