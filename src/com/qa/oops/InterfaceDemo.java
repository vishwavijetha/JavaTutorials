package com.qa.oops;

interface one {
	public void display1();
}

interface two {
	public void display2();
}

interface three extends one, two {
	public void display1();
}

class InterfaceClass implements three {

	@Override
	public void display2() {
		// TODO Auto-generated method stub
		System.out.println("Need to provide implementation for display2()");

	}

	@Override
	public void display1() {
		// TODO Auto-generated method stub
		System.out.println("Need to provide implementation for display1()");
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {

		InterfaceClass interfaceClass = new InterfaceClass();
		interfaceClass.display1();
		interfaceClass.display2();
		interfaceClass.display1();
	}
}
