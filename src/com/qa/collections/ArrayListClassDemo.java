package com.qa.collections;

import java.util.ArrayList;

public class ArrayListClassDemo {

	/**
	 * ArrayList is a part of collection framework and is present in java.util
	 * package. It provides us with dynamic arrays in Java. Though, it may be slower
	 * than standard arrays but can be helpful in programs where lots of
	 * manipulation in the array is needed.
	 * 
	 * Allows Random access
	 * 
	 * Allows duplicates
	 * 
	 * Not ordered
	 * 
	 * ArrayList can not be used for primitive types, like int, char, etc. We need a
	 * wrapper class for such cases.
	 * 
	 * How the ArrayList capacity is calculated?
	 * 
	 * newCapacity = (oldCapacity * 3)/2 + 1 That is 150% of the existing capacity
	 * plus 1. So, for example, if the ArrayList capacity is 10 and the 11th element
	 * is added to it, the new internal array will be created with a size of (10 *
	 * 3)/2 + 1 that is 16.
	 * 
	 * ArrayList<Integer> numbers = new ArrayList<Integer>(int initialCapacity);
	 */
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(5);
		numbers.add(15);
		numbers.add(1);
		numbers.add(10);
		System.out.println(numbers);
		numbers.add(7);
		System.out.println(numbers);
		numbers.set(0, 8);
		System.out.println(numbers);
		numbers.remove(numbers.size() - 1);
		System.out.println(numbers);
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		System.out.println();
		for (int number : numbers) {
			System.out.println(number);
		}
	}

}
