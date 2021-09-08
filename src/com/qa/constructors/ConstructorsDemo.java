package com.qa.constructors;

class Parent {

	{
		System.out.println("This block gets executed first");
	}

	Parent() {
		System.out.println("Default constructor of Parent called");
	}

	Parent(String name) {
		System.out.println("String param constructor of Parent called: " + name);
	}
}

class Child extends Parent {
	Child() {
		super();
		System.out.println("Default constructor of Child called");
	}

	Child(String name) {
		super(name);
		System.out.println("String param constructor of Child called: " + name);
	}
}

public class ConstructorsDemo {

	String name, location;
	int age;
	String phone;
	boolean flag;

	// default - provided by java runtime
	ConstructorsDemo() {
		System.out.println("Default Constructor called");
	}

	// with param name
	ConstructorsDemo(String name) {
		this.name = name;
	}

	// with params name, age
	ConstructorsDemo(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// with params name, age
	ConstructorsDemo(boolean flag) {
		this.flag = flag;
	}

	//
	ConstructorsDemo(String name, int age, String phone, String location) {
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.location = location;
	}

	// Copy constructor
	ConstructorsDemo(ConstructorsDemo copyConstructorObj) {
		name = copyConstructorObj.name;
		age = copyConstructorObj.age;
		phone = copyConstructorObj.phone;
		location = copyConstructorObj.location;
	}

	@Override
	public String toString() {
		return "Name: '" + name + "', Age: " + age + ", Phone: '" + phone + "', Location: '" + location + "'";
	}

	ConstructorsDemo(int x) {
		this(); // Calls default constructor
		System.out.println(x);
	}

	ConstructorsDemo(int x, int y) {
		this(5); // Calls previous constructor
		System.out.println(x * y);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		ConstructorsDemo constructorsDemo1 = new ConstructorsDemo();
		System.out.println("Name: " + constructorsDemo1.name);
		System.out.println("Age: " + constructorsDemo1.age);
		System.out.println("Flag: " + constructorsDemo1.flag);
		System.out.println("---------------------------");
		ConstructorsDemo constructorsDemo2 = new ConstructorsDemo("Vishwa");
		System.out.println("Name: " + constructorsDemo2.name);
		System.out.println("Age: " + constructorsDemo2.age);
		System.out.println("Flag: " + constructorsDemo2.flag);
		System.out.println("---------------------------");
		ConstructorsDemo constructorsDemo3 = new ConstructorsDemo("Vishwa", 32);
		System.out.println("Name: " + constructorsDemo3.name);
		System.out.println("Age: " + constructorsDemo3.age);
		System.out.println("Flag: " + constructorsDemo3.flag);
		System.out.println("---------------------------");
		ConstructorsDemo constructorsDemo4 = new ConstructorsDemo(true);
		System.out.println("Name: " + constructorsDemo4.name);
		System.out.println("Age: " + constructorsDemo4.age);
		System.out.println("Flag: " + constructorsDemo4.flag);
		System.out.println("---------------------------");

		ConstructorsDemo copyConstructor = new ConstructorsDemo("Vishwa Vijetha", 32, "7760607555", "Bangalore");
		ConstructorsDemo copyConstructor1 = new ConstructorsDemo(copyConstructor);
		System.out.println(copyConstructor1);
		System.out.println("---------------------------");

		ConstructorsDemo constrcutorChainingDemo = new ConstructorsDemo(10, 20);
		System.out.println("---------------------------");

		Child obj = new Child("John");

	}

}
