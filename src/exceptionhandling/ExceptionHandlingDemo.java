package exceptionhandling;

public class ExceptionHandlingDemo {

	/**
	 * An exception is an unwanted or unexpected event, which occurs during the
	 * execution of a program i.e at run time, that disrupts the normal flow of the
	 * program’s instructions.
	 * 
	 * Error vs Exception
	 * 
	 * Error: An Error indicates serious problem that a reasonable application
	 * should not try to catch. Exception: Exception indicates conditions that a
	 * reasonable application might try to catch.
	 * 
	 * Exceptions(Checked/Unchecked) -> Throwable -> Object Error(VM Error/Assertion
	 * Error) -> Throwable -> Object
	 */

	public static void main(String[] args) {
		// String str = null;
		// System.out.println(str.length()); // NullPointerException
		try {
			System.out.println(1 / 0);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finally this block gets executed regardless of exception");
		}

		try {
			int i[] = new int[2];
			System.out.println(i[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

		/**
		 * Built-in Exceptions ex:
		 * 
		 * Built-in exceptions are the exceptions which are available in Java libraries.
		 * These exceptions are suitable to explain certain error situations. Below is
		 * the list of important built-in exceptions in Java.
		 * 
		 * 1. ArithmeticException It is thrown when an exceptional condition has
		 * occurred in an arithmetic operation.
		 * 
		 * 2. ArrayIndexOutOfBoundsException It is thrown to indicate that an array has
		 * been accessed with an illegal index. The index is either negative or greater
		 * than or equal to the size of the array.
		 * 
		 * 3. ClassNotFoundException This Exception is raised when we try to access a
		 * class whose definition is not found
		 * 
		 * 4. FileNotFoundException This Exception is raised when a file is not
		 * accessible or does not open.
		 * 
		 * 5. IOException It is thrown when an input-output operation failed or
		 * interrupted
		 * 
		 * 6. InterruptedException It is thrown when a thread is waiting, sleeping, or
		 * doing some processing, and it is interrupted.
		 * 
		 * 7. NoSuchFieldException It is thrown when a class does not contain the field
		 * (or variable) specified
		 * 
		 * 8. NoSuchMethodException It is thrown when accessing a method which is not
		 * found.
		 * 
		 * 9. NullPointerException This exception is raised when referring to the
		 * members of a null object. Null represents nothing
		 * 
		 * 10. NumberFormatException This exception is raised when a method could not
		 * convert a string into a numeric format.
		 * 
		 * 11. RuntimeException This represents any exception which occurs during
		 * runtime.
		 * 
		 * 12. StringIndexOutOfBoundsException It is thrown by String class methods to
		 * indicate that an index is either negative or greater than the size of the
		 * string
		 */

	}

}
