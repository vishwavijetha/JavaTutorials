package collections;

import java.util.Vector;

public class VectorClassDemo {

	/**
	 * Vector implements a dynamic array that means it can grow or shrink as
	 * required. Like an array, it contains components that can be accessed using an
	 * integer index They are very similar to ArrayList but Vector is synchronized
	 * and has some legacy method that the collection framework does not contain
	 * 
	 * Initial Capacity 10
	 * 
	 * After exceeding initial capacity of 10 it increase to 20 and so on.
	 */
	
	public static void main(String[] args) {
		Vector<String> vector = new Vector<>();
		vector.add("Hi");
		vector.add("Hello");
		vector.add("Welcome");
		vector.add("1");
		vector.add("2");
		vector.add("3");
		vector.add("4");
		vector.add("5");
		vector.add("6");
		vector.add("7");
		vector.add("8");
		System.out.println(vector);
		System.out.println(vector.firstElement());
		System.out.println(vector.capacity());
		vector.setSize(30);
		System.out.println(vector.capacity());
	}

}
