package com.qa.collections;

import java.util.TreeSet;

public class TreeSetClassDemo {

	/**
	 * Set <-(extends) SortedSet <-(extends) NavigableSet <-(implements) TreeSet
	 * 
	 * TreeSet is one of the most important implementations of the SortedSet
	 * interface in Java that uses a Tree for storage. The ordering of the elements
	 * is maintained by a set using their natural ordering whether or not an
	 * explicit comparator is provided. This must be consistent with equals if it is
	 * to correctly implement the Set interface.
	 * 
	 * TreeSet is basically an implementation of a self-balancing binary search tree
	 * like a Red-Black Tree. Therefore operations like add, remove, and search
	 * takes O(log(N)) time. The reason is that in a self-balancing tree, it is made
	 * sure that the height of the tree is always O(log(N)) for all the operations.
	 * Therefore, this is considered as one of the most efficient data structures in
	 * order to store the huge sorted data and perform operations on it. However,
	 * operations like printing N elements in the sorted order take O(N) time
	 */

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("Apple");
		treeSet.add("Ball");
		treeSet.add("Cat");
		System.out.println(treeSet);
		System.out.println(treeSet.first());
		System.out.println(treeSet.last());
		System.out.println(treeSet.higher("Ball"));
		System.out.println(treeSet.lower("Ball"));
	}

}
