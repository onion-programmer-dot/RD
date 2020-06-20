package com.rd.interview.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestArrayList {

	
	public static void main(String args[]) {
		try{
		List<String> list = new ArrayList<String>();
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		System.out.println(list.toString());
		
		for(String s : list){
		
			if(s.equals("c")){
				list.remove(new String("c"));
			}
			System.out.println(s);
		}
		
		Iterator<String> iterator = list.iterator();
		
		while(iterator.hasNext()){
			
			String next = iterator.next();
			
			iterator.remove();
			
			System.out.println(next);
		}
		
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
