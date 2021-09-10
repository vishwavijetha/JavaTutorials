package com.qa.collections;

import java.util.*;

class StackClassDemo {

	// Main Method
	public static void main(String[] args)
	{

		// Initialization of Stack using Generics
		Stack<String> stack = new Stack<String>();

		// pushing the elements
		stack.push("apple");
		stack.push("orange");
		stack.push("mango");
		System.out.println(stack);
		
		System.out.println("The element at the top of the stack is: " + stack.peek());
		stack.pop();
		System.out.println(stack);
		stack.push("banana");
		System.out.println(stack);
		System.out.println(stack.search("orange"));
	}
}
