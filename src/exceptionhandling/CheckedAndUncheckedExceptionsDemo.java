package exceptionhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedAndUncheckedExceptionsDemo {

	public static void main(String[] args) throws IOException {

		/**
		 * 1) Checked: are the exceptions that are checked at compile time. If some code
		 * within a method throws a checked exception, then the method must either
		 * handle the exception or it must specify the exception using throws keyword
		 */
		FileReader file = new FileReader("C:\\Users\\Vishwa.Vijetha\\a.txt");
		BufferedReader fileInput = new BufferedReader(file);

		// Print first 3 lines of file "C:\test\a.txt"
		while (fileInput.readLine() != null)
			System.out.println(fileInput.readLine());

		fileInput.close();

		/**
		 * 2) Unchecked are the exceptions that are not checked at compiled time. In
		 * C++, all exceptions are unchecked, so it is not forced by the compiler to
		 * either handle or specify the exception. It is up to the programmers to be
		 * civilized, and specify or catch the exceptions. In Java exceptions under
		 * Error and RuntimeException classes are unchecked exceptions, everything else
		 * under throwable is checked
		 */
		int x = 0;
		int y = 10;
		int z = y / x;
		/**
		 * Above code throws below exception
		 * Exception in thread "main" java.lang.ArithmeticException: / by zero at
		 * com.qa.exceptionhandling.CheckedAndUncheckedExceptionsDemo.main(CheckedAndUncheckedExceptionsDemo.java:36)
		 */
	}

}
