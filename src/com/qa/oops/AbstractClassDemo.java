package com.qa.oops;

//An abstract class with constructor
abstract class Base {
	Base() {
		System.out.println("Base Constructor Called");
	}

	abstract void fun();

	final void display() {
		System.out.println("Base class display");
	}

	static void print() {
		System.out.println("Base print() called");
	}
}

final class Final {
	public Final() {
		System.out.println("Final constructor");
	}
}

/*
 * This throws error. Final class cannot support inheritance class Derived
 * extends Final {
 * 
 * }
 */

class Derived extends Base {
	Derived() {
		System.out.println("Derived Constructor Called");
	}

	void fun() {
		System.out.println("Derived fun() called");
	}

	/*
	 * Cannot override final methods in derived class
	 * 
	 * @Override void display() {
	 * 
	 * }
	 */
}

public class AbstractClassDemo {

	public static void main(String[] args) {

		// Base base = new Base(); Throws error, cant create object for abstract class
		Derived d = new Derived();
		d.fun();
		Base.print();

	}
}

/**
 * Abstract class vs Interface
 * 
 * Type of methods: Interface can have only abstract methods. An abstract class
 * can have abstract and non-abstract methods. From Java 8, it can have default
 * and static methods also.
 * 
 * Final Variables: Variables declared in a Java interface are by default final.
 * An abstract class may contain non-final variables.
 * 
 * Type of variables: Abstract class can have final, non-final, static and
 * non-static variables. The interface has only static and final variables.
 * 
 * Implementation: Abstract class can provide the implementation of the
 * interface. Interface can�t provide the implementation of an abstract class.
 * 
 * Inheritance vs Abstraction: A Java interface can be implemented using the
 * keyword �implements� and an abstract class can be extended using the keyword
 * �extends�.
 * 
 * Multiple implementations: An interface can extend another Java interface
 * only, an abstract class can extend another Java class and implement multiple
 * Java interfaces.
 * 
 * Accessibility of Data Members: Members of a Java interface are public by
 * default. A Java abstract class can have class members like private,
 * protected, etc.
 */
