package hw_4;

import java.util.Scanner;

public class Task_3 {

	// A company has name, address, phone number, fax number, web site and
	// manager
	// The manager has first name, last name, age and a phone number.
	// Write a program that reads the information about a company and its
	// manager and prints them on the console.

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String compName = scan.nextLine();
		String compАddress = scan.nextLine();
		long compPhoneNum = scan.nextLong();
		long compFaxNum = scan.nextLong();
		String compWebSite = scan.nextLine();

		String compManagerFName = scan.nextLine();
		String compManagerLName = scan.nextLine();
		int compManagerAge = scan.nextInt();
		long compManagerPhoneNum = scan.nextLong();

		System.out.println();

		System.out.println(compName);
		System.out.println(compАddress);
		System.out.println(compPhoneNum);
		System.out.println(compFaxNum);
		System.out.println(compWebSite);

		System.out.println(compManagerFName);
		System.out.println(compManagerLName);
		System.out.println(compManagerAge);
		System.out.println(compManagerPhoneNum);
		scan.close();
	}
}