package oops;

//Java program to demonstrate working of Comparator
//interface more than one field

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class ComparatorInterfaceDemo {

	// instance member variables
	String Name;
	int Age;

	// parameterized constructor
	public ComparatorInterfaceDemo(String Name, Integer Age) {
		this.Name = Name;
		this.Age = Age;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public Integer getAge() {
		return Age;
	}

	public void setAge(Integer Age) {
		this.Age = Age;
	}

	// overriding toString() method
	@Override
	public String toString() {
		return "Customer{" + "Name=" + Name + ", Age=" + Age + '}';
	}

	static class CustomerSortingComparator implements Comparator<ComparatorInterfaceDemo> {

		@Override
		public int compare(ComparatorInterfaceDemo customer1, ComparatorInterfaceDemo customer2) {

			// for comparison
			int NameCompare = customer1.getName().compareTo(customer2.getName());
			int AgeCompare = customer1.getAge().compareTo(customer2.getAge());

			// 2-level comparison
			return (NameCompare == 0) ? AgeCompare : NameCompare;
		}
	}

	public static void main(String[] args) {

		// create ArrayList to store Student
		List<ComparatorInterfaceDemo> al = new ArrayList<>();

		// create customer objects using constructor
		// initialization
		ComparatorInterfaceDemo obj1 = new ComparatorInterfaceDemo("Ajay", 27);
		ComparatorInterfaceDemo obj2 = new ComparatorInterfaceDemo("Sneha", 23);
		ComparatorInterfaceDemo obj3 = new ComparatorInterfaceDemo("Simran", 37);
		ComparatorInterfaceDemo obj4 = new ComparatorInterfaceDemo("Ajay", 22);
		ComparatorInterfaceDemo obj5 = new ComparatorInterfaceDemo("Ajay", 29);
		ComparatorInterfaceDemo obj6 = new ComparatorInterfaceDemo("Sneha", 22);

		// add customer objects to ArrayList
		al.add(obj1);
		al.add(obj2);
		al.add(obj3);
		al.add(obj4);
		al.add(obj5);
		al.add(obj6);

		// before Sorting arraylist: iterate using Iterator
		Iterator<ComparatorInterfaceDemo> custIterator = al.iterator();

		System.out.println("Before Sorting:\n");
		while (custIterator.hasNext()) {
			System.out.println(custIterator.next());
		}

		// sorting using Collections.sort(al, comparator);
		Collections.sort(al, new CustomerSortingComparator());

		// after Sorting arraylist: iterate using enhanced
		// for-loop
		System.out.println("\n\nAfter Sorting:\n");
		for (ComparatorInterfaceDemo customer : al) {
			System.out.println(customer);
		}
	}
}
