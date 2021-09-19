package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListInterfaceDemo {

	/**
	 * The List interface provides a way to store the ordered collection. It is a
	 * child interface of Collection. It is an ordered collection of objects in
	 * which duplicate values can be stored. Since List preserves the insertion
	 * order, it allows positional access and insertion of elements
	 * 
	 * Since List is an interface, objects cannot be created of the type list. We
	 * always need a class that extends this list in order to create an object
	 */

	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<String>();
		System.out.println("-----------------");
		System.out.println("Before arrayList");
		System.out.println(arrayList);
		arrayList.add("India");
		arrayList.add("America");
		arrayList.add("Germany");
		arrayList.add("Australia");
		arrayList.add("Japan");
		System.out.println("-----------------");
		System.out.println("After arrayList.add(items)");
		System.out.println(arrayList);
		System.out.println("-----------------");
		System.out.println("Before sort()");
		System.out.println(arrayList);
		System.out.println("-----------------");
		System.out.println("After sort()");
		Collections.sort(arrayList);
		System.out.println(arrayList);
		System.out.println("-----------------");
		System.out.println("Before add(index, item)");
		arrayList.add(0, "Canada");
		System.out.println(arrayList);
		System.out.println("-----------------");
		System.out.println("After add(index, item)");
		System.out.println(arrayList);
		System.out.println("-----------------");
		System.out.println("arrayList.contains('India')");
		System.out.println(arrayList.contains("India"));
		System.out.println("-----------------");
		System.out.println("Before set(index, item)");
		arrayList.set(0, "England");
		System.out.println(arrayList);
		System.out.println("-----------------");

		/**
		 * AbstractList, CopyOnWriteArrayList , and the AbstractSequentialList are the
		 * classes that implement the List interface. A separate functionality is
		 * implemented in each of the mentioned classes. They are as follows:
		 * 
		 * 
		 * AbstractList: This class is used to implement an unmodifiable list, for which
		 * one needs to only extend this AbstractList Class and implement only the get()
		 * and the size() methods.
		 * 
		 * CopyOnWriteArrayList: This class implements the list interface. It is an
		 * enhanced version of ArrayList in which all the modifications(add, set,
		 * remove, etc.) are implemented by making a fresh copy of the list.
		 * 
		 * AbstractSequentialList: This class implements the Collection interface and
		 * the AbstractCollection class. This class is used to implement an unmodifiable
		 * list, for which one needs to only extend this AbstractList Class and
		 * implement only the get() and the size() methods.
		 */
	}

}
