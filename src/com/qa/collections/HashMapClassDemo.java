package com.qa.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapClassDemo {

	/**
	 * HashMap<K, V> is a part of Java’s collection since Java 1.2. This class is
	 * found in java.util package. It provides the basic implementation of the Map
	 * interface of Java. It stores the data in (Key, Value) pairs, and you can
	 * access them by an index of another type (e.g. an Integer). One object is used
	 * as a key (index) to another object (value). If you try to insert the
	 * duplicate key, it will replace the element of the corresponding key.
	 * 
	 * HashMap is similar to HashTable, but it is unsynchronized. It allows to store
	 * the null keys as well, but there should be only one null key object and there
	 * can be any number of null values. This class makes no guarantees as to the
	 * order of the map. To use this class and its methods, you need to import
	 * java.util.HashMap package or its superclass.
	 * 
	 * HashMap is unsynchronized i.e. multiple threads can access it simultaneously.
	 * 
	 * Initial Capacity 16
	 * 
	 * Load factor 0.75
	 * 
	 * Internally HashMap contains an array of Node and a node is represented as a
	 * class that contains 4 fields:
	 * 
	 * 1. int hash 2. K key 3. V value 4. Node next. It can be seen that the node is
	 * containing a reference to its own object. So it’s a linked list.
	 * 
	 * Hashcode is calculated using below formula
	 * 
	 * s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
	 * 
	 * where:
	 * 
	 * s is ith character in the string n is length of the string ^ is exponential
	 * operand Example: For example if you want to calculate hashcode for string
	 * "abc" then we have below details
	 * 
	 * s[] = {'a', 'b', 'c'} n = 3 So the hashcode value will be calculated as:
	 * 
	 * s[0]*31^(2) + s[1]*31^1 + s[2] = a*31^2 + b*31^1 + c*31^0 = (ASCII value of a
	 * = 97, b = 98 and c = 99) = 97*961 + 98*31 + 99 = 93217 + 3038 + 99 = 96354 So
	 * the hashcode value for 'abc' is 96354
	 * 
	 * hashcode % 16 (capacity of HashMap) -> index (0-15) where the entry will be stored
	 * 
	 * In case of same index then it uses LinkedList to link the next entry at same index
	 */

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(10, "Windows");
		map.put(2, "MAC");
		System.out.println(map);
		map.put(3, "Linux");
		System.out.println(map);
		map.put(1, "Android");
		System.out.println(map);
		map.put(null, null); // Allows null key and null values
		System.out.println(map);
		map.put(4, null);
		System.out.println(map);
		System.out.println(map.containsValue("MAC"));
		System.out.println(map.get(3));
		System.out.println(map.keySet());
		System.out.println(map.values());
		map.remove(null);
		System.out.println(map);
		System.out.println(map.get(1).hashCode());

		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}

	}

}
