package operators;

public class Operators {

	public static void main(String[] args) {

		int number1 = 10, number2 = 20, total;

		// Addition(+)
		total = number1 + number2;
		System.out.println(total);

		// Subtraction(-)
		total = number1 - number2;
		System.out.println(total);

		// Multiplication(*)
		total = number1 * number2;
		System.out.println(total);

		// Division(/)
		total = number1 / number2;
		System.out.println(total);
		total = number2 / number1;
		System.out.println(total);

		// Modulus(%)
		int remainder = number2 % (number1 - 1);
		System.out.println(remainder);

		// Increment(++)
		System.out.println(number1++);
		System.out.println(number1);
		System.out.println(++number1);
		System.out.println(number1);

		// Decrement(--)
		System.out.println(number1--);
		System.out.println(number1);
		System.out.println(--number1);
		System.out.println(number1);

		// Unary Minus(-)
		System.out.println(number1);
		number1 = -number1;
		System.out.println(number1);

		// NOT(!)
		boolean flag = true;
		System.out.println(!flag);

		// Bitwise Compliment(~) - 2's Compliment
		// number2 = 20 = binary(sign bit(0) 0001 0100)
		// 2's compliment(0001 0100 + 1) -> sign bit(1) 0001 0101
		System.out.println(~number2);

		// Compound(+=)
		number1 = 10;
		number1 += 10;
		System.out.println(number1);
		number1 = +10; // This works just like assignment
		System.out.println(number1);

		// Compound(-=)
		number1 = 10;
		number1 -= 10;
		System.out.println(number1);
		number1 = -10; // This works just like assignment
		System.out.println(number1);

		// Compound(*=)
		number1 = 10;
		number1 *= 10;
		System.out.println(number1);

		// Compound(/=)
		number1 = 100;
		number1 /= 10;
		System.out.println(number1);

		// Compound(%=)
		number1 = 5;
		number1 %= 2;
		System.out.println(number1);

		// Equal to(==)
		System.out.println(number1 == number2);

		// Not equal to(!=)
		System.out.println(number1 != number2);

		// Greater than(>)
		System.out.println(number1 > number2);

		// Less than(<)
		System.out.println(number1 < number2);

		// Greater than or equal to(>=)
		System.out.println(number1 >= number2);

		// Less than or equal to(<=)
		System.out.println(number1 <= number2);

		// Logical AND(&&)
		if (number1 <= number2 && number2 >= number1) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		// Logical OR(||)
		if (number1 <= number2 || number2 >= 0) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		// Logical NOT(!)
		if (!(number1 == 0)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		// Bitwise OR(|)
		number1 = 5;
		number2 = 7;
		System.out.println(number1 | number2); // 5(0101) | 7(0111) = 7(0111)

		// Bitwise AND(&)
		System.out.println(number1 & number2); // 5(0101) & 7(0111) = 5(0101)

		// Bitwise XOR(^)
		System.out.println(number1 & number2); // 5(0101) ^ 7(0111) = 7(0010) -> if bits are diff then 1 else 0

		// Bitwise 2's Compliment(~)
		System.out.println(~number1); // 5(sign bit(0) 0101 + 1) -> (sign bit(1) 0110)

		// Signed Right shift(>>)
		// 5(0101) -> shift right by 1 bit = 2((0 inserted at MSB and 1 is removed at LSB) 0010)
		number1 = 5;
		System.out.println(number1 >> -1); // --> 0
		System.out.println(number1 >> 0); // --> 5
		System.out.println(number1 >> 2); // --> 1
		
		// Unsigned Right shift(>>>) preserves sign
		number1 = 5;
		System.out.println(number1 >>> 1); // --> 2
		number1 = -1;
		System.out.println(number1 >>> 1); // --> 2147483647
		
		// Left shift(<<)
		number1 = 5;
		System.out.println(5 << 1); // 5(0000 0101) << 1 = 10(0000 1010)
		
		// Unsigned Left shift (<<<)
		// Unlike unsigned Right Shift, there is no “<<<” operator in Java, because the logical (<<) 
		// and arithmetic left-shift (<<<) operations are identical.
		// System.out.println(number1 <<< 1); -> syntax error
		
		
		
		

	}

}
