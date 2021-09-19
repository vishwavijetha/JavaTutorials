package collections;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapInterfaceDemo {

	/**
	 * The main characteristic of a SortedMap is that it orders the keys by their
	 * natural ordering, or by a specified comparator. So consider using a TreeMap
	 * when you want a map that satisfies the following criteria:
	 * 
	 * null key or null value is not permitted. The keys are sorted either by
	 * natural ordering or by a specified comparator.
	 */
	public static void main(String[] args) {
		
		SortedMap<String, String> sortedMap1 = new TreeMap<String, String>();
		sortedMap1.put("one", "India");
		sortedMap1.put("two", "America");
		sortedMap1.put("three", "Germany");
		sortedMap1.put("four", "Japan");
		System.out.println("Sorted keys using default/natural order: ");
		System.out.println(sortedMap1);
		System.out.println(sortedMap1.comparator());
		
		SortedMap<String, String> sortedMap2 = new TreeMap<String, String>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		sortedMap2.put("one", "India");
		sortedMap2.put("two", "America");
		sortedMap2.put("three", "Germany");
		sortedMap2.put("four", "Japan");
		System.out.println("Sorted keys using comparator interface: ");
		System.out.println(sortedMap2);
		System.out.println(sortedMap2.comparator());
	}
}
