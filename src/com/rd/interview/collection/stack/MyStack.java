package com.rd.interview.collection.stack;

import java.util.Stack;

/**
 * 
 * @author alok.kumar
 * 
 *         The stack is the subclass of Vector. It implements the
 *         last-in-first-out data structure, i.e., Stack. The stack contains all
 *         of the methods of Vector class and also provides its methods like
 *         boolean push(), boolean peek(), boolean push(object o), which defines
 *         its properties.
 * 
 *         1. Method:: Object push(Object element) : Pushes an element on the
 *         top of the stack
 * 
 *         2. Object pop() : Removes and returns the top element of the stack.
 *         An ‘EmptyStackException’ exception is thrown if we call pop() when
 *         the invoking stack is empty.
 * 
 *         3. Object peek() : Returns the element on the top of the stack, but
 *         does not remove it.
 * 
 *         4. boolean empty() : It returns true if nothing is on the top of the
 *         stack. Else, returns false.
 * 
 *         5. int search(Object element) : It determines whether an object exists
 *         in the stack. If the element is found, it returns the position of the
 *         element from the top of the stack. Else, it returns -1.
 *
 */
public class MyStack {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();  
		stack.push("Ayush");  
		stack.push("Garvit");  
		stack.push("Amit");  
		stack.push("Ashish");  
		stack.push("Garima");  
		
		String pop = stack.pop();
		System.out.println(pop);
		/*Iterator<String> itr=stack.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  */

	}

}
