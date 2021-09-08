package com.qa.datatypes;

public class DataTypes {

	public static void main(String[] args) {

		// 1. boolean(true/false) -> 1 bit -> default(false)
		boolean flag = false;
		if (flag) {
			System.out.println("This got executed because flag is true");
		} else {
			System.out.println("This didn't get executed because flag is false");
		}

		// 2. byte(signed two's compliment number) -> 8 bits -> -128 to 127 ->default(0)
		byte a = 126;
		System.out.println(a);
		a++;
		System.out.println(a);
		// It overflows here because
		// byte can hold values from -128 to 127
		a++;
		System.out.println(a);
		// Looping back within the range
		a++;
		System.out.println(a);

		// 3. short(signed two's compliment number) -> 2 bytes(16 bits) -> -32,768 to
		// 32,767 -> default(0)
		short b = 32766;
		System.out.println(b);
		b++;
		System.out.println(b);
		// It overflows here
		b++;
		System.out.println(b);
		// Looping back within the range
		b++;
		System.out.println(b);

		// 4. int(signed two's compliment number) -> 4 bytes(32 bits) -> -2,147,483,648
		// to 2,147,483,647 -> default(0)
		int c = 2147483646;
		System.out.println(c);
		c++;
		System.out.println(c);
		// It overflows here
		c++;
		System.out.println(c);
		// Looping back within the range
		c++;
		System.out.println(c);

		// 5. long(signed two's compliment number) -> 8 bytes(32 bits) ->
		// -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 -> default(0)
		long d = 922337208;
		System.out.println(d);
		d++;
		System.out.println(d);

		// 6. float(single precision floating number) -> 4 bytes(32 bits) -> upto 7
		// decimals -> default(0.0)
		float e = 1.234567890123f;
		System.out.println(e);

		// 7. double(double precision floating number) -> 8 bytes(64 bits) -> upto 16
		// decimals -> default(0.0)
		double f = 1.234567890123456789;
		System.out.println(f);

		// 8. char(single unicode character) -> 2 bytes(16 bits) -> '\u0000' (0) to
		// '\uffff' (65535) -> default('\u0000')
		char g = 'A';
		System.out.println(g);
		g++;
		System.out.println(g);
		g = 65;
		System.out.println(g);
		g = 97;
		System.out.println(g);

		// 9. String(array of characters) -> default(null)
		// String objects will be created in String constant pool
		// Helps JVM to optimise memory allocation in a better way
		String h = "Declare String without using new operator which allocates same memory location";
		System.out.println(h);
		// String objects will be created dynamically with new memory allocation in
		// pool. This string won't be added to String constant pool
		String i = new String("Declare String using new operator which allocates different memory location");
		System.out.println(i);

	}

}
