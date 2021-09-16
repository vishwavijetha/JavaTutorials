package com.qa.collections;

import java.util.PriorityQueue;

public class PriorityQueueClassDemo {

	/**
	 * A PriorityQueue is used when the objects are supposed to be processed based
	 * on the priority. It is known that a Queue follows the First-In-First-Out
	 * algorithm, but sometimes the elements of the queue are needed to be processed
	 * according to the priority, that’s when the PriorityQueue comes into play. The
	 * PriorityQueue is based on the priority heap. The elements of the priority
	 * queue are ordered according to the natural ordering, or by a Comparator
	 * provided at queue construction time, depending on which constructor is used.
	 * 
	 * an element with maximum ASCII value will have the highest priority.
	 */
	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Cat");
		queue.add("Ball");
		queue.add("Apple");
		System.out.println(queue);
		// Printing the top element of the PriorityQueue
		System.out.println(queue.peek());
		queue.remove();
		System.out.println(queue);

		// Printing the top element and removing it from the PriorityQueue container
		System.out.println(queue.poll());
		System.out.println(queue);

		// Printing the top element again
		System.out.println(queue.comparator());
	}

}
