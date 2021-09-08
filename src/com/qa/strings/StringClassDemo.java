package com.qa.strings;

public class StringClassDemo {

	public static void main(String[] args) {

		// Strings are immutable (cannot change/grow memory internalyy)
		// String is a sequence of characters. In java, objects of String are immutable
		// which means a constant and cannot be changed once created.

		/***
		 * 1. String(byte[] byte_arr) – Construct a new String by decoding the byte
		 * array. It uses the platform’s default character set for decoding.
		 */
		// A to Z(65-90), a to z(97-122), 0 to 9(48-57)
		byte[] b_arr = { 86, 105, 115, 104, 119, 97 };
		String s_byte = new String(b_arr);
		System.out.println(s_byte); // Prints Vishwa
		byte[] n_arr = { 48, 49, 50 };
		String n_byte = new String(n_arr);
		System.out.println(n_byte); // Prints 012
		System.out.println("------------------------");

		/***
		 * 2. String(char[] char_arr) – Allocates a new String from the given Character
		 * array
		 */
		char char_arr[] = { 'V', 'i', 's', 'h', 'w', 'a' };
		String s = new String(char_arr);
		System.out.println(s);
		System.out.println("------------------------");

		/***
		 * String Methods 1. int length(): Returns the number of characters in the
		 * String
		 */
		System.out.println("Vishwa".length());
		System.out.println("------------------------");

		/***
		 * 2. Char charAt(int i): Returns the character at ith index
		 */
		System.out.println("Vishwa".charAt(0));
		System.out.println("------------------------");

		/***
		 * 3. String substring (int i, int j): Return the substring from the ith index
		 * character to end
		 */
		System.out.println("Vishwa".substring(3));
		System.out.println("Vishwa".substring(2, 4));
		System.out.println("------------------------");

		/***
		 * 4. String concat( String str): Concatenates specified string to the end of
		 * this string
		 */
		String s1 = "Vishwa";
		String s2 = " ";
		String s3 = "Vijetha";
		String output = s1.concat(s2).concat(s3);
		System.out.println(output);
		System.out.println("------------------------");

		/***
		 * 5. int indexOf (String s): Returns the index within the string of the first
		 * occurrence of the specified string
		 */
		System.out.println("Vishwa".indexOf("a"));
		System.out.println("------------------------");

		/***
		 * 6. int indexOf (String s, int i): Returns the index within the string of the
		 * first occurrence of the specified string, starting at the specified index
		 */
		System.out.println("VishwaVishwa".indexOf("sh", 0));
		System.out.println("VishwaVishwa".indexOf("sh", 5));
		System.out.println("------------------------");

		/***
		 * 7. int lastIndexOf( String s): Returns the index within the string of the
		 * last occurrence of the specified string
		 */
		System.out.println("VishwaVishwa".lastIndexOf("V"));
		System.out.println("------------------------");

		/***
		 * 8. boolean equals( Object otherObj): Compares this string to the specified
		 * object
		 */
		System.out.println("Vishwa".equals("vishwa"));
		System.out.println("Vishwa".equals("Vishwa"));
		System.out.println("------------------------");

		/**
		 * 9. boolean equalsIgnoreCase (String anotherString): Compares string to
		 * another string, ignoring case considerations
		 */
		System.out.println("Vishwa".equalsIgnoreCase("vishwa"));
		System.out.println("------------------------");

		/**
		 * 10. int compareTo( String anotherString): Compares two string
		 * lexicographically
		 */
		System.out.println("ABC".compareTo("AB")); // 1
		System.out.println("ABC".compareTo("ABC")); // 0
		System.out.println("ABC".compareTo("BC")); // -1
		System.out.println("BC".compareTo("ABC")); // 1
		System.out.println("------------------------");

		/**
		 * 11. String toLowerCase(): Converts all the characters in the String to lower
		 * case
		 */
		System.out.println("ABCDEF".toLowerCase());
		System.out.println("------------------------");

		/**
		 * 12. String toUpperCase(): Converts all the characters in the String to upper
		 * case
		 */
		System.out.println("abcdef".toUpperCase());
		System.out.println("------------------------");

		/**
		 * 13. String trim(): Returns the copy of the String, by removing whitespaces at
		 * both ends. It does not affect whitespaces in the middle
		 */
		System.out.println(" Hello World ".trim());
		System.out.println("------------------------");

		/**
		 * 14. String replace (char oldChar, char newChar): Returns new string by
		 * replacing all occurrences of oldChar with newChar
		 */
		System.out.println("Hello".replace("l", "z"));
		System.out.println("------------------------");

		/**
		 * 15. public boolean contains(CharSequence char_seq) – It returns true if the
		 * given CharSquence is present in the String on which its invoked
		 */
		System.out.println("Vishwa".contains("ish"));
		System.out.println("Vishwa".contains("Z"));
		System.out.println("------------------------");

		/**
		 * 16. public boolean startsWith(String pre) – It takes in parameter a String
		 * prefix and returns true if the String has a same prefix
		 */
		System.out.println("Hello".startsWith("He"));
		System.out.println("Hello".startsWith("he"));
		System.out.println("------------------------");

		/**
		 * 17. public boolean endsWith(String suf) – It takes in parameter a String
		 * suffix and return true if the String has same suffix
		 */
		System.out.println("Hello".endsWith("llo"));
		System.out.println("Hello".endsWith("ll"));
		System.out.println("------------------------");

		/**
		 * 18. public String[] split(String reg_exp, int limit) – It splits the string
		 * around the regular expression and limit refers to the number of times the
		 * reg_exp is applied and it is the length of the resulting array and reg_exp is
		 * n is applied only length – 1 times
		 */
		String split_arr[] = "Hello".split("l");
		for (String splits: split_arr) {
			System.out.println(splits);
		}
		split_arr = "Hello".split("l", 1);
		for (String splits: split_arr) {
			System.out.println(splits);
		}
		System.out.println("Hello".split("l")[0]);
		System.out.println("------------------------");
	}

}
