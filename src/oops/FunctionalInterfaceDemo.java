package oops;

/**
 * A functional interface is an interface that contains only one abstract
 * method. They can have only one functionality to exhibit. From Java 8 onwards,
 * lambda expressions can be used to represent the instance of a functional
 * interface. A functional interface can have any number of default methods.
 * Runnable, ActionListener, Comparable are some of the examples of functional
 * interfaces. Before Java 8, we had to create anonymous inner class objects or
 * implement these interfaces.
 *
 */

//Java program to demonstrate lambda expressions to implement
//a user defined functional interface.

@FunctionalInterface
interface Square {
	int calculate(int x);
}

class FunctionalInterfaceDemo {
	public static void main(String args[]) {
		int a = 5;

		// lambda expression to define the calculate method
		Square s = (int x) -> x * x;

		// parameter passed and return type must be
		// same as defined in the prototype
		int ans = s.calculate(a);
		System.out.println(ans);

		// Java program to demonstrate functional interface
		// create anonymous inner class object
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("New thread created");
			}
		}).start();

		// Java program to demonstrate Implementation of functional interface using
		// lambda expression to create the object
		new Thread(() -> {
			System.out.println("New thread created");
		}).start();
	}
}
