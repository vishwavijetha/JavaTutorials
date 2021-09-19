package readinputfromconsole;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		System.out.println("Enter name:");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.println(name);
		scanner.close();
	}
}
