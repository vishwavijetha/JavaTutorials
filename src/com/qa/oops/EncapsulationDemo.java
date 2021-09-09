package com.qa.oops;

class Enacpsulate {

	private String name;
	private int rollNumber, age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

public class EncapsulationDemo {

	/**
	 * Encapsulation is defined as the wrapping up of data under a single unit. It
	 * is the mechanism that binds together code and the data it manipulates.
	 * Another way to think about encapsulation is, it is a protective shield that
	 * prevents the data from being accessed by the code outside this shield
	 * 
	 * Technically in encapsulation, the variables or data of a class is hidden from
	 * any other class and can be accessed only through any member function of its
	 * own class in which it is declared
	 */

	public static void main(String[] args) {

		Enacpsulate enacpsulate = new Enacpsulate();
		enacpsulate.setName("John");
		enacpsulate.setAge(21);
		enacpsulate.setRollNumber(101);
		System.out.println(enacpsulate.getName());
		System.out.println(enacpsulate.getAge());
		System.out.println(enacpsulate.getRollNumber());
	}

}
