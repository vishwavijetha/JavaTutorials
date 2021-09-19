package collections;

import java.util.Comparator;
import java.util.TreeMap;

//A class to represent a student.
class Student {
	int rollno;
	String name, address;

	// Constructor
	public Student(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}

	// Used to print student details
	// in main()
	public String toString() {
		return this.rollno + " " + this.name + " " + this.address;
	}

}

// Comparator implementattion
class Sortbyroll implements Comparator<Student> {

	// Used for sorting in ascending order of
	// roll number
	public int compare(Student a, Student b) {
		return a.rollno - b.rollno;
	}
}

public class TreeMapClassDemo {

	/**
	 * This class is a member of Java Collections Framework. The class implements
	 * Map interfaces including NavigableMap, SortedMap and extends AbstractMap
	 * class. TreeMap in Java does not allow null keys (like Map) and thus a
	 * NullPointerException is thrown. However, multiple null values can be
	 * associated with different keys. Entry pairs returned by the methods in this
	 * class and its views represent snapshots of mappings at the time they were
	 * produced. They do not support the Entry.setValue method.
	 */
// Java program to demonstrate an example of TreeMap using a comparator constructor

	static void Example2ndConstructor() {
		// Creating an empty TreeMap
		TreeMap<Student, Integer> tree_map = new TreeMap<Student, Integer>(new Sortbyroll());

		// Mapping string values to int keys
		tree_map.put(new Student(111, "bbbb", "london"), 2);
		tree_map.put(new Student(131, "aaaa", "nyc"), 3);
		tree_map.put(new Student(121, "cccc", "jaipur"), 1);

		// Displaying the TreeMap
		System.out.println("TreeMap: " + tree_map);
	}

	public static void main(String[] args) {

		System.out.println("TreeMap using " + "TreeMap(Comparator)" + " constructor:\n");
		Example2ndConstructor();
	}
}
