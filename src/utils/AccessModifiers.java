package utils;

// private class A {} -> throws error. Only public, abstract & final are permitted
// final class A {} abstract class B extends A{} -> throws error. The type B cannot subclass the final class A
// class A {} -> default modifier - The class is only accessible by classes in the same package. This is used when you don't specify a modifier

class A {
	private int i = 5;
	protected int j = 10;
	public int k = 15;
	final int x = 100;
}

class B extends A {

}

public class AccessModifiers {

	public static void main(String[] args) {
		// throws error since i is private which can be accessed only within same class
		// System.out.println(new B().i); System.out.println(new A().i);

		System.out.println(new B().j); // protected can be accessed from class/subclass but not outside other classes
		System.out.println(new A().j); 
		System.out.println(new A().k);
		System.out.println(new A().x);
		// int a = new A().x = 200; // throws error. final field cant be modified
		
	}
}
