package com.rd.interview.java8.lamda;

/**
 * 
 * @author alok.kumar
 *	
 * User class it has user related attributes 
 */

public class User {
	
	private int id;
	private String name;
	
	
	public User() {
		super();
	}
	
	
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
