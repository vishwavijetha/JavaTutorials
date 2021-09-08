package com.qa.conditionalstatements;

public class IfElseDemo {

	public static void main(String[] args) {
		boolean flag = true;
		if (flag) {
			System.out.println("If");
		} else {
			System.out.println("Else");
		}

		int a = 1, b = 2;
		if (a == 1) {
			if (b == 2) {
				System.out.println("Nested If");
			}
		}
		
		String str = "Hello";
		if(str.indexOf('h') >= 0) {
			System.out.println("If");
		} else if(str.indexOf('H') >= 0) {
			System.out.println("Else If");
		}

	}

}
