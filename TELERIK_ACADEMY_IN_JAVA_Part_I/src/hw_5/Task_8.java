package hw_5;

import java.util.Scanner;

public class Task_8 {

	// Write a program that, depending on the user's choice inputs int, double
	// or string variable. If the variable is integer or double, increases it
	// with 1. If the variable is string, appends "*" at its end. The program
	// must show the value of that variable as a console output. Use switch
	// statement

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out
				.println("Enter one of the following inputs:\nint, double or string "
						+ "variable, in oder to get the respective variables\n");
		String choice = scan.nextLine();

		switch (choice) {
		case "int":
			int integ = scan.nextInt() + 1;
			System.out.println(integ);
			break;
		case "double":
			double doubl = scan.nextDouble() + 1;
			System.out.println(doubl);
			break;
		case "string":
			String string = scan.nextLine() + "*";
			System.out.println(string);
			break;
		default:
			System.out.println("No such input choice exists");
			break;
		}
		scan.close();
	}
}