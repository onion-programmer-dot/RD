package com.rd.interview.java8;

public interface InterfaceDefalutMethod {

	default void testDefalut(){
		System.out.println("Test defalut");
	}
	
	default void testDefalut1(){
		System.out.println("Test defalut1");
	}
	
	static void testStatic(){
		System.out.println("Test static");
	}
}
