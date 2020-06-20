package com.rd.interview.ptatice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArrayElement {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add("H");
		list.add("A");
		list.add("");
		list.add("L");
		
		System.out.println(list);
		Collections.sort(list);
		
		System.out.println(list);
		
		
		String str = "aaaabbccd";
		for(int i=0; i<str.length(); i++){
			char charAt = str.charAt(i);
			int indexOf = str.indexOf(charAt);
			int lastIndexOf = str.lastIndexOf(str.charAt(i));
			
			System.out.println(charAt + " index "+ indexOf +"  last index of  "+ lastIndexOf );
			
		}
		
		
	}

}
