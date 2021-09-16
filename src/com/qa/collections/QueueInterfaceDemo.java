package com.qa.collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterfaceDemo {

	/**
	 * The Queue interface present in the java.util package and extends the
	 * Collection interface is used to hold the elements about to be processed in
	 * FIFO(First In First Out) order. It is an ordered list of objects with its use
	 * limited to insert elements at the end of the list and deleting elements from
	 * the start of the list, (i.e.), it follows the FIFO or the First-In-First-Out
	 * principle.
	 */
	public static void main(String[] args) {
		Queue<Integer> ll = new LinkedList<Integer>();
		ll.add(10);
		ll.add(20);
		ll.add(15);

		// Printing the top element of the LinkedList
		System.out.println(ll.peek());

		// Printing the top element and removing it from the LinkedList container
		System.out.println(ll.poll());

		// Printing the top element again
		System.out.println(ll.peek());
	}

}
