package com.qa.arrays;

import java.util.Arrays;

public class ArraysDemo {

	public int roll_no;
	public String name;

	ArraysDemo(int roll_no, String name) {
		this.roll_no = roll_no;
		this.name = name;
	}

	public static void main(String[] args) {

		/**
		 * An array is a group of like-typed variables that are referred to by a common
		 * name. In Java all arrays are dynamically allocated. The size of an array must
		 * be specified by an int or short value and not long. The direct superclass of
		 * an array type is Object. Every array type implements the interfaces Cloneable
		 * and java.io.Serializable. Array can contain primitives (int, char, etc.) as
		 * well as object (or non-primitive) references of a class depending on the
		 * definition of the array. In case of primitive data types, the actual values
		 * are stored in contiguous memory locations. In case of objects of a class, the
		 * actual objects are stored in heap segment.
		 */

		/**
		 * Declaring arrays: int intArray[]; or int[] intArray; byte byteArray[]; short
		 * shortsArray[]; boolean booleanArray[]; long longArray[]; float floatArray[];
		 * double doubleArray[]; char charArray[]; MyClass myClassArray[]; Object[] ao;
		 * Collection[] ca; array of Collection of unknown type
		 */

		int intArr1[] = new int[5];
		intArr1[0] = 0;
		intArr1[1] = 1;
		intArr1[2] = 2;
		intArr1[3] = 3;
		for (int i = 0; i < intArr1.length; i++) {
			System.out.println(intArr1[i]);
		}

		System.out.println("-----------------------");
		int[] intArr2 = new int[] { 0, 1, 2, 3 };
		System.out.println(Arrays.toString(intArr2));

		System.out.println("-----------------------");
		// Array of Objects
		ArraysDemo[] students = new ArraysDemo[3];
		students[0] = new ArraysDemo(123, "John");
		students[1] = new ArraysDemo(456, "Peter");
		students[2] = new ArraysDemo(789, "Lucy");
		for (ArraysDemo student : students) {
			System.out.println(student.roll_no + " " + student.name);
		}

		System.out.println("-----------------------");
		int[][] multiDimensionArray = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int i = 0; i < multiDimensionArray.length; i++) {
			for (int j = 0; j < multiDimensionArray.length; j++) {
				System.out.print(multiDimensionArray[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("-----------------------");
		int intArray[] = new int[3];
		byte byteArray[] = new byte[3];
		short shortsArray[] = new short[3];
		String[] strArray = new String[3];
		System.out.println(intArray.getClass());
		System.out.println(intArray.getClass().getSuperclass());
		System.out.println(byteArray.getClass());
		System.out.println(shortsArray.getClass());
		System.out.println(strArray.getClass());

		System.out.println("-----------------------");
		int a[] = { 1, 2, 3 };
		int b[] = new int[a.length];
		// Doesn't copy elements of a[] to b[],
		// only makes b refer to same location
		b = a;

		// Change to b[] will also reflect in a[]
		// as 'a' and 'b' refer to same location.
		b[0]++;

		System.out.println("Contents of a[] ");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");

		System.out.println("\n\nContents of b[] ");
		for (int i = 0; i < b.length; i++)
			System.out.print(b[i] + " ");
		
		System.out.println("\n\nContents of c[] ");
		int c[] = b.clone();
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
		
		System.out.println("-----------------------");
		System.out.println(Arrays.equals(a, b));
	}

}
