package collections;

/**
 * Collection: Collection is a interface present in java.util.package. It is
 * used to represent a group of individual objects as a single unit. The
 * collection is considered as the root interface of the collection framework.
 * It provides several classes and interfaces to represent a group of individual
 * objects as a single unit.
 * 
 * The List, Set, and Queue are the main sub-interfaces of the collection
 * interface. The map interface is also part of the java collection framework,
 * but it doesn’t inherit the collection of the interface. The add(), remove(),
 * clear(), size(), and contains() are the important methods of the Collection
 * interface.
 *
 * Collections: Collections is a utility class present in java.util.package. It
 * defines several utility methods like sorting and searching which is used to
 * operate on collection. It has all static methods. These methods provide
 * much-needed convenience to developers, allowing them to effectively work with
 * Collection Framework. For example, It has a method sort() to sort the
 * collection elements according to default sorting order, and it has a method
 * min(), and max() to find the minimum and maximum value respectively in the
 * collection elements
 */

//Java program to demonstrate the difference
//between Collection and Collections

import java.util.*;

public class CollectionVsCollectionsDemo {

	public static void main(String[] args) {

		// Creating an object of List<String>
		List<String> arrlist = new ArrayList<String>();

		// Adding elements to arrlist
		arrlist.add("audi");
		arrlist.add("merc");
		arrlist.add("bmw");
		System.out.println("Elements of arrlist:");
		System.out.println(arrlist);
		System.out.println("Elements of arrlist after the addAll operation:");

		// Adding all the specified elements to the specified collection
		Collections.addAll(arrlist, "landrover", "jaguar");
		System.out.println(arrlist);
		// Sorting all the elements of the specified collection according to default
		// sorting order
		Collections.sort(arrlist);
		System.out.println(arrlist);
	}
}
