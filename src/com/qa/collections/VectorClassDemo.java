package com.qa.collections;

import java.util.Vector;

public class VectorClassDemo {

	/**
	 * Vector implements a dynamic array that means it can grow or shrink as
	 * required. Like an array, it contains components that can be accessed using an
	 * integer index They are very similar to ArrayList but Vector is synchronized
	 * and has some legacy method that the collection framework does not contain
	 */
	
	public static void main(String[] args) {
		Vector<String> vector = new Vector<>();
		vector.add("Hi");
		vector.add("Hello");
		vector.add("Welcome");
		System.out.println(vector);
		System.out.println(vector.firstElement());
		System.out.println(vector.capacity());
		vector.setSize(20);
		System.out.println(vector.capacity());
	}

}
