package com.qa.collections;

import java.util.LinkedHashMap;

public class LinkedHashMapClassDemo {
	/**
	 * A LinkedHashMap contains values based on the key. It implements the Map
	 * interface and extends the HashMap class. It contains only unique elements. It
	 * may have one null key and multiple null values. It is non-synchronized. It is
	 * the same as HashMap with an additional feature that it maintains insertion
	 * order. For example, when we run the code with a HashMap, we get a different
	 * order of elements.
	 */
	public static void main(String[] args) {
		LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("one", "India");
		linkedHashMap.put("two", "America");
		linkedHashMap.put("three", "Germany");
		linkedHashMap.put("four", "Japan");
		System.out.println(linkedHashMap);
	}

}
