package com.qa.loops;

public class LoopsDemo {

	public static void main(String[] args) {

		// while
		int x = 0;
		while (x <= 5) {	
			System.out.println("x = " + x);
			x++;
		}
		
		System.out.println("------------------------");
		
		// for - version1
		x = 5;
		for (int i = 0; i < x; i++) {
			System.out.println("i = " + i);	
		}
		
		System.out.println("------------------------");
		
		// for - version2
		String[] arr = {"Hi", "Hello", "Welcome"};
		for (String string : arr) {
			System.out.println(string);
		}
		// Same logic using version1
		// for (int i = 0; i < arr.length; i++) {
		//	 System.out.println(arr[i]);
		// }
		
		System.out.println("------------------------");
		
		// do while
		x = 5;
		do {
			System.out.println("This will execute for the first time regardless of while condition");
		} while (x == 0);
		
		System.out.println("------------------------");
		
		// Pitfalls in loops: 1. Infinite loops, Out of memory errors
	}

}
