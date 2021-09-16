package com.qa.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListClassDemo {

	/**
	 * Linked List is a part of the Collection framework present in java.util
	 * package. This class is an implementation of the LinkedList data structure
	 * which is a linear data structure where the elements are not stored in
	 * contiguous locations and every element is a separate object with a data part
	 * and address part. The elements are linked using pointers and addresses. Each
	 * element is known as a node. Due to the dynamicity and ease of insertions and
	 * deletions, they are preferred over the arrays. It also has few disadvantages
	 * like the nodes cannot be accessed directly instead we need to start from the
	 * head and follow through the link to reach to a node we wish to access.
	 * 
	 * [HEAD] -> [data|reference] -> [data|reference] 
	 * 
	 * Allows sequential access (start from head and follow through link to reach actual node)
	 * 
	 * Allows duplicates
	 * 
	 * Ordered
	 */
	public static void main(String[] args) {
		LinkedList<Object> linkedList = new LinkedList<Object>();
		linkedList.add("hi");
		linkedList.add(123);
		linkedList.add("hello");
		System.out.println(linkedList);
		
		linkedList.addFirst("welcome");
		System.out.println(linkedList);
		linkedList.addLast("test");
		System.out.println(linkedList);
		
		linkedList.removeFirst();
		System.out.println(linkedList);
		
		linkedList.removeLast();
		System.out.println(linkedList);
		
		linkedList.pollFirst();
		System.out.println(linkedList);
		
		linkedList.offerFirst("new");
		System.out.println(linkedList);
		
		linkedList.offerLast("last");
		System.out.println(linkedList);
		
		for(Object obj: linkedList) {
			System.out.println(obj);
		}
		System.out.println();
		Iterator<Object> listIterator = linkedList.listIterator();
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
	}
}
