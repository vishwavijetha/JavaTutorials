package exceptionhandling;

/**
 * throw keyword in Java is used to explicitly throw an exception from a method
 * or any block of code. We can throw either checked or unchecked exception. The
 * throw keyword is mainly used to throw custom exceptions
 * 
 * throws is a keyword in Java which is used in the signature of method to
 * indicate that this method might throw one of the listed type exceptions. The
 * caller to these methods has to handle the exception using a try-catch block
 */

@SuppressWarnings("serial")
class MyException extends Exception {
	// default constructor
	MyException() {
	}

	// parameterized constructor
	MyException(String str) {
		super(str);
	}
}

public class UserDefinedExceptionDemo {

	private static int accno[] = { 1001, 1002, 1003, 1004 };

	private static String name[] = { "Nish", "Shubh", "Sush", "Abhi", "Akash" };

	private static double bal[] = { 10000.00, 12000.00, 5600.0, 999.00, 1100.55 };

	public static void main(String[] args) {
		try {
			// display the heading for the table
			System.out.println("ACCNO" + "\t" + "CUSTOMER" + "\t" + "BALANCE");

			// display the actual account information
			for (int i = 0; i < 5; i++) {
				System.out.println(accno[i] + "\t" + name[i] + "\t\t" + bal[i]);

				// display own exception if balance < 1000
				if (bal[i] < 1000) {
					throw new MyException("Balance is less than 1000");
				}
			}
		} // end of try

		catch (MyException e) {
			e.printStackTrace();
		}
	}
}
