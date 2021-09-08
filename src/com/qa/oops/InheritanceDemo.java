package com.qa.oops;

class Vehicle {
	
	String vehicleName, vehicleType;
	int makeYear;

	public Vehicle(String vehicleName, String vehicleType, int makeYear) {
		this.makeYear = makeYear;
		this.vehicleName = vehicleName;
		this.vehicleType = vehicleType;
	}

	@Override
	public String toString() {
		return "Vehicle Name: " + vehicleName + ", Vehicle Type: " + vehicleType + ", Make Year: " + makeYear;
	}

}

class TwoWheeler extends Vehicle {

	int price;

	public TwoWheeler(String vehicleName, String vehicleType, int makeYear, int price) {
		super(vehicleName, vehicleType, makeYear);
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vehicle Name: " + vehicleName + ", Vehicle Type: " + vehicleType + ", Make Year: " + makeYear
				+ ", Price: " + price;
	}
}

class FourWheeler extends Vehicle {

	int price;

	public FourWheeler(String vehicleName, String vehicleType, int makeYear, int price) {
		super(vehicleName, vehicleType, makeYear);
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vehicle Name: " + vehicleName + ", Vehicle Type: " + vehicleType + ", Make Year: " + makeYear
				+ "Price: " + price;
	}

}

public class InheritanceDemo {

	/**
	 * Inheritance is an important pillar of OOP(Object-Oriented Programming). It is
	 * the mechanism in java by which one class is allowed to inherit the
	 * features(fields and methods) of another class
	 */

	public static void main(String[] args) {

		Vehicle vehicle = new Vehicle("Suzuki", "Two Wheeler", 2019);
		System.out.println(vehicle); // Calls toString() of Vehicle class
		Vehicle twoWheeler = new TwoWheeler("Suzuki", "Two Wheeler", 2020, 85000);
		System.out.println(twoWheeler); // Calls toString() of TwoWheeler class
		TwoWheeler twoWheeler2 = new TwoWheeler("Suzuki", "Two Wheeler", 2021, 90000);
		System.out.println(twoWheeler2); // Calls toString() of TwoWheeler class
		Vehicle fourWheeler = new FourWheeler("BMW", "Four Wheeler", 2021, 4000000);
		System.out.println(fourWheeler); // Calls toString() of FourWheeler class
		FourWheeler fourWheeler2 = new FourWheeler("AUDI", "Four Wheeler", 2021, 5000000);
		System.out.println(fourWheeler2); // Calls toString() of FourWheeler class

	}

}
