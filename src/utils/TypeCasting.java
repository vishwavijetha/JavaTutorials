package utils;

public class TypeCasting {

	/**
	 * Widening Casting (automatically) - converting a smaller type to a larger type
	 * size byte -> short -> char -> int -> long -> float -> double
	 * 
	 * Narrowing Casting (manually) - converting a larger type to a smaller size
	 * type double -> float -> long -> int -> char -> short -> byte
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intValue = 10;
		double doubleValue = intValue; // Auto type casting
		System.out.println(intValue);
		System.out.println(doubleValue);
		double d = 123.456789;
		int i = (int) d; // Manual type casting
		System.out.println(d);
		System.out.println(i);

	}

}
