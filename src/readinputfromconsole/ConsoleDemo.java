package readinputfromconsole;

public class ConsoleDemo {

	// Note that this program does not work on IDEs as
	// System.console() may require console
	public static void main(String[] args) {
		System.out.println("Enter password:");
		String name = System.console().readLine();
		System.out.println(name);
	}

}
