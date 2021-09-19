package conditionalstatements;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		System.out.println("Enter Day in number:");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		scanner.close();
		switch (number) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid day");
			break;
		}
		
		switch (number) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Weekday");
			break;
		case 6:
		case 7:
			System.out.println("Weekend");
			break;
		default:
			System.out.println("Invalid day");
			break;
		}

	}

}
