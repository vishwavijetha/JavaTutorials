package com.qa.collections;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceDemo {

	/**
	 * The Map interface present in java.util package represents a mapping between a
	 * key and a value. The Map interface is not a subtype of the Collection
	 * interface. Therefore it behaves a bit differently from the rest of the
	 * collection types. A map contains unique keys.
	 * 
	 * A Map cannot contain duplicate keys and each key can map to at most one
	 * value. Some implementations allow null key and null value like the HashMap
	 * and LinkedHashMap, but some do not like the TreeMap. The order of a map
	 * depends on the specific implementations. For example, TreeMap and
	 * LinkedHashMap have predictable order, while HashMap does not. There are two
	 * interfaces for implementing Map in java. They are, Map and SortedMap, and
	 * three classes: HashMap, TreeMap and LinkedHashMap
	 */
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Windows");
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
		
		for(Map.Entry<Integer, String> entry: map.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
	}
	

}
