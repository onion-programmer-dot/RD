package com.rd.interview.java8.lamda;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author alok.kumar
 *	
 * Printing user details through lambda 
 */
public class PrintUserDetails {

	public static void main(String[] args) {

		List<User> list = new ArrayList<User>();
		
		list.add(new User(1, "a"));
		list.add(new User(2, "b"));
		list.add(new User(3, "c"));
		list.add(new User(4, "d"));
		list.add(new User(5, "e"));
		// created user list and added user entry in the list id and name
		
		
		// fetching value from the user list using lambda expression
		list.forEach(user -> {
			System.out.print(user.getId());
			System.out.print("\t" +user.getName() );
			
			System.out.println();
		});
	}

}
