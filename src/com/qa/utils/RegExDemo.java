package com.qa.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {

	/**
	 * Java does not have a built-in Regular Expression class, but we can import the
	 * java.util.regex package to work with regular expressions. The package
	 * includes the following classes:
	 * 
	 * Pattern Class - Defines a pattern (to be used in a search) Matcher Class -
	 * Used to search for the pattern PatternSyntaxException Class - Indicates
	 * syntax error in a regular expression pattern
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile("hello", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher("Visit HELLO!");
		boolean matchFound = matcher.find();
		if (matchFound) {
			System.out.println("Match found: " + matcher.group());
		} else {
			System.out.println("Match not found");
		}

		Pattern p1 = Pattern.compile("[a-z]+");
		Matcher m1 = p1.matcher("abc123efg456");
		while (m1.find()) {
			System.out.println(m1.group());
		}

		Pattern p2 = Pattern.compile("[0-9]+");
		Matcher m2 = p2.matcher("abc123efg456");
		while (m2.find()) {
			System.out.println(m2.group());
		}

		// Count special characters
		Pattern p3 = Pattern.compile("[^\\da-z]");
		Matcher m3 = p3.matcher("abc123efg456  @!#$%^ab&*(");
		int count = 0;
		while (m3.find()) {
			count++;
		}
		System.out.println(count);
	}

}
