package com.qa.oops;

//The word polymorphism means having many forms

/**
 * 1. Compile-time polymorphism: It is also known as static polymorphism. This
 * type of polymorphism is achieved by function overloading or operator
 * overloading. But Java doesn’t support the Operator Overloading
 */
class Multiplication {
	static int Multiply(int a, int b) {
		return a * b;
	}

	static double Multiply(double a, double b) {
		return a * b;
	}

	static int Multiply(int a, int b, int c) {
		return a * b * c;
	}
}

/**
 * 2. Runtime polymorphism: It is also known as Dynamic Method Dispatch. It is a
 * process in which a function call to the overridden method is resolved at
 * Runtime. This type of polymorphism is achieved by Method Overriding.
 */
class Parent {
	public void display() {
		System.out.println("Parent method called");
	}
}

class Child1 extends Parent {
	public void display() {
		System.out.println("Child1 method called");
	}
}

class Child2 extends Parent {
	public void display() {
		System.out.println("Child2 method called");
	}
}

public class PolymorphismDemo {

	public static void main(String[] args) {

		// Compile-time polymorphism: Method overloading
		System.out.println(Multiplication.Multiply(10, 10));
		System.out.println(Multiplication.Multiply(5.5, 5.5));
		System.out.println(Multiplication.Multiply(10, 10, 10));

		// Runtime polymorphism: Method overriding
		Parent obj;
		obj = new Parent();
		obj.display();
		obj = new Child1();
		obj.display();
		obj = new Child2();
		obj.display();

	}

}
