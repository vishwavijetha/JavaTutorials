package com.qa.strings;

public class StringBufferClassDemo {

	public static void main(String[] args) {

		/**
		 * StringBuffer is a peer class of String that provides much of the
		 * functionality of strings. String represents fixed-length, immutable character
		 * sequences while StringBuffer represents growable and writable character
		 * sequences.
		 * 
		 * StringBuffer may have characters and substrings inserted in the middle or
		 * appended to the end. It will automatically grow to make room for such
		 * additions and often has more characters preallocated than are actually
		 * needed, to allow room for growth.
		 */

		/**
		 * StringBuffer Constructors - 1. StringBuffer( ): It reserves room for 16
		 * characters without reallocation. 2. StringBuffer( int size)It accepts an
		 * integer argument that explicitly sets the size of the buffer. 3.
		 * StringBuffer(String str): It accepts a String argument that sets the initial
		 * contents of the StringBuffer object and reserves room for 16 more characters
		 * without reallocation.
		 */
		
		StringBuffer stringBuffer = new StringBuffer("Hello World!");
		System.out.println(stringBuffer.length()); // 12
		System.out.println(stringBuffer.capacity()); // 16 (reserved) + 12 (length of stringbuffer)
		
		System.out.println(stringBuffer.append(false));
		System.out.println(stringBuffer.append(123));
		System.out.println(stringBuffer.append("extra"));
		
		System.out.println(stringBuffer.insert(0, false));
		System.out.println(stringBuffer.insert(0, "Hello"));
		
		System.out.println(stringBuffer.reverse());
		System.out.println(stringBuffer.reverse());
		
		System.out.println(stringBuffer.delete(0, 5));
		System.out.println(stringBuffer.deleteCharAt(5));
		
		System.out.println(stringBuffer.replace(0, 5, "New"));

	}

}
