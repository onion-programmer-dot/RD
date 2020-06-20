package com.rd.interview.java8.funcationlInterface;

/**
 * 
 * @author alok.kumar
 *	
 * A interface which is one abstract method is called functional interface 
 * 
 * funcationl interface has be before from java 8 like comparable, comprarator both have one abstract method
 * 
 * yes, @funcationalIntrface annotation has been introduce in java 8
 */

@FunctionalInterface
public interface TestFunctionalInterface {

	void testfuncational(int x);
	
	// void testfuncational1(int x); so we cannot define two abstract method inside it
}
