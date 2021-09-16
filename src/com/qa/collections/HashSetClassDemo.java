package com.qa.collections;

import java.util.HashSet;

public class HashSetClassDemo {

	/**
	 * The HashSet class implements the Set interface, backed by a hash table which
	 * is actually a HashMap instance. No guarantee is made as to the iteration
	 * order of the set which means that the class does not guarantee the constant
	 * order of elements over time. This class permits the null element. The class
	 * also offers constant time performance for the basic operations like add,
	 * remove, contains, and size assuming the hash function disperses the elements
	 * properly among the buckets
	 * 
	 * Implements Set Interface.
	 * 
	 * The underlying data structure for HashSet is Hashtable.
	 * 
	 * As it implements the Set Interface, duplicate values are not allowed.
	 * 
	 * Objects that you insert in HashSet are not guaranteed to be inserted in the
	 * same order. Objects are inserted based on their hash code.
	 * 
	 * NULL elements are allowed in HashSet.
	 * 
	 * HashSet also implements Serializable and Cloneable interfaces
	 * 
	 * Initial capacity 16
	 * 
	 * Load factor default 0.75%
	 * 
	 * Threshold = 12 (16 * 0.75), means capacity gets increased to 32 after it
	 * exceeds 12 elements
	 */

	public static void main(String[] args) {

		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("Apple");
		hashSet.add("Ball");
		hashSet.add("Apple");
		hashSet.add("Cat");
		hashSet.add("Ball");
		System.out.println(hashSet);
		hashSet.add(null);
		hashSet.add(null);
		System.out.println(hashSet);
		System.out.println(hashSet.hashCode());
	}

}
