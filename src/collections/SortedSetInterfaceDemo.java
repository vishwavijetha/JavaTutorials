package collections;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetInterfaceDemo {

	/**
	 * 
	 * Set <-(extends) <-(extends) SortedSet <-(extends) NavigableSet <-(implements) TreeSet
	 * 
	 * The SortedSet interface present in java.util package extends the Set
	 * interface present in the collection framework. It is an interface that
	 * implements the mathematical set. This interface contains the methods
	 * inherited from the Set interface and adds a feature that stores all the
	 * elements in this interface to be stored in a sorted manner.
	 */

	public static void main(String[] args) {
		
		SortedSet<String> sortedSet = new TreeSet<String>();
		String[] array = {"India", "America", "Japan", "Canada", "Australia", "Germany"};
		sortedSet.addAll(Arrays.asList(array));
		System.out.println(sortedSet);
		System.out.println(sortedSet.contains("India"));
		System.out.println(sortedSet.first());
		System.out.println(sortedSet.last());
		System.out.println(sortedSet.subSet("Canada", "India"));
	}
}
