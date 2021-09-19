package oops;

/**
 * Encapsulation vs Data Abstraction
 * 
 * Encapsulation is data hiding(information hiding) while Abstraction is detail
 * hiding(implementation hiding). While encapsulation groups together data and
 * methods that act upon the data, data abstraction deals with exposing the
 * interface to the user and hiding the details of implementation
 */

abstract class Shape {
	String color;

	// these are abstract methods
	abstract double area();

	public abstract String toString();

	// abstract class can have constructor
	public Shape(String color) {
		System.out.println("Shape constructor called");
		this.color = color;
	}

	// this is a concrete method
	public String getColor() {
		return color;
	}
}

class Circle extends Shape {
	double radius;

	public Circle(String color, double radius) {
		super(color); // calling Shape constructor
		System.out.println("Circle constructor called");
		this.radius = radius;
	}

	@Override
	double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		return "Circle color is " + super.getColor() + "and area is : " + area();
	}
}

class Rectangle extends Shape {

	double length;
	double width;

	public Rectangle(String color, double length, double width) {
		super(color); // calling Shape constructor
		System.out.println("Rectangle constructor called");
		this.length = length;
		this.width = width;
	}

	@Override
	double area() {
		return length * width;
	}

	@Override
	public String toString() {
		return "Rectangle color is " + super.getColor() + " and area is : " + area();
	}
}

public class AbstractionDemo {

	public static void main(String[] args) {
		
		Shape s1 = new Circle("Red", 2.2);
        Shape s2 = new Rectangle("Yellow", 2, 4);
 
        System.out.println(s1.toString());
        System.out.println(s2.toString());

	}

}
