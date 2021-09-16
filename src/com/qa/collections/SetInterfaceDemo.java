package com.qa.collections;

import java.util.*;

public class SetInterfaceDemo {

	/**
	 * The set interface is present in java.util package and extends the Collection
	 * interface is an unordered collection of objects in which duplicate values
	 * cannot be stored. It is an interface that implements the mathematical set.
	 * This interface contains the methods inherited from the Collection interface
	 * and adds a feature that restricts the insertion of the duplicate elements.
	 * There are two interfaces that extend the set implementation namely SortedSet
	 * and NavigableSet.
	 */

	// Java Program Demonstrating Operations on the Set
	// such as Union, Intersection and Difference operations

	public static void main(String args[]) {
		// Creating an object of Set class
		// Declaring object of Integer type
		Set<Integer> a = new HashSet<Integer>();

		// Adding all elements to List
		a.addAll(Arrays.asList(new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));

		// Again declaring object of Set class
		// with reference to HashSet
		Set<Integer> b = new HashSet<Integer>();

		b.addAll(Arrays.asList(new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 }));
		System.out.println("Set a: " + a);
		System.out.println("Set b: " + b);

		// To find union
		Set<Integer> union = new HashSet<Integer>(a);
		union.addAll(b);
		System.out.println("Union of a(u)b: " + union);

		// To find intersection
		Set<Integer> intersection = new HashSet<Integer>(a);
		intersection.retainAll(b);
		System.out.println("Intersection of a(n)b: " + intersection);

		// To find the symmetric difference
		Set<Integer> difference = new HashSet<Integer>(a);
		difference.removeAll(b);
		System.out.print("Difference of a-b: " + difference);
		System.out.println();
		
		Set<String> hs = new HashSet<String>();
        hs.add("B");
        hs.add("B");
        hs.add("C");
        hs.add("A");
        hs.add("D");
        hs.add("C");
 
        // Removes duplicates
        System.out.println(hs);
	}

}
