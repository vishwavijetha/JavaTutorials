package com.qa.collections;

import java.util.Hashtable;

public class HashTableClassDemo {

	/**
	 * It is similar to HashMap, but is synchronized. Hashtable stores key/value
	 * pair in hash table. In Hashtable we specify an object that is used as a key,
	 * and the value we want to associate to that key. The key is then hashed, and
	 * the resulting hash code is used as the index at which the value is stored
	 * within the table. The initial default capacity of Hashtable class is 11
	 * (after java 8 it is 16) whereas loadFactor is 0.75. HashMap doesn’t provide
	 * any Enumeration, while Hashtable provides not fail-fast Enumeration.
	 * 
	 * No null key/values allowed
	 * 
	 * Legacy collection class
	 */
	
	public static void main(String[] args) {
		Hashtable<String, Integer> hashtable = new Hashtable<String, Integer>();
		hashtable.put("Vishwa", 100);
		hashtable.put("Vijetha", 200);
		hashtable.put("John", 300);
		hashtable.put("Chris", 400);
		hashtable.put("Robert", 500);
		hashtable.put("a", 530);
		hashtable.put("A ", 530);
		// hashtable.put(null, 530); // NullPointerException
		// hashtable.put("ABC", null); // NullPointerException
		System.out.println(hashtable);
	}
	

}
