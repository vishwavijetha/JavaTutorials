package com.qa.strings;

public class StringBuilderClassDemo {

	public static void main(String[] args) {

		/**
		 * StringBuilder in Java represents a mutable sequence of characters. Since the
		 * String Class in Java creates an immutable sequence of characters, the
		 * StringBuilder class provides an alternative to String Class, as it creates a
		 * mutable sequence of characters. The function of StringBuilder is very much
		 * similar to the StringBuffer class, as both of them provide an alternative to
		 * String Class by making a mutable sequence of characters. However the
		 * StringBuilder class differs from the StringBuffer class on the basis of
		 * synchronization. The StringBuilder class provides no guarantee of
		 * synchronization whereas the StringBuffer class does. Therefore this class is
		 * designed for use as a drop-in replacement for StringBuffer in places where
		 * the StringBuffer was being used by a single thread (as is generally the
		 * case). Where possible, it is recommended that this class be used in
		 * preference to StringBuffer as it will be faster under most implementations.
		 * Instances of StringBuilder are not safe for use by multiple threads. If such
		 * synchronization is required then it is recommended that StringBuffer be used.
		 */

		/**
		 * StringBuilder constructors - 1. StringBuilder(): Constructs a string builder
		 * with no characters in it and an initial capacity of 16 characters.
		 * 
		 * 2. StringBuilder(int capacity): Constructs a string builder with no characters
		 * in it and an initial capacity specified by the capacity argument.
		 * 
		 * 3. StringBuilder(CharSequence seq): Constructs a string builder that contains
		 * the same characters as the specified CharSequence.
		 * 
		 * 4. StringBuilder(String str): Constructs a string builder initialized to the
		 * contents of the specified string.
		 */
		
		StringBuilder stringBuilder = new StringBuilder();
		System.out.println(stringBuilder.capacity()); // 16
		System.out.println(stringBuilder.append("Hi"));
		System.out.println(stringBuilder.length()); // 2
		System.out.println(stringBuilder.append("Hello"));
		System.out.println(stringBuilder.reverse());
		System.out.println(stringBuilder.toString());
		System.out.println(stringBuilder.reverse());
		System.out.println(stringBuilder.insert(0, false));
		System.out.println(stringBuilder.delete(0, 5));
		System.out.println(stringBuilder.charAt(5));
		
	}

}
