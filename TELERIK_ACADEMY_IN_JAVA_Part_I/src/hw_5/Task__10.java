package hw_5;

import java.util.Scanner;

public class Task__10 {

	// Write a program that applies bonus scores to given scores in the range
	// [1..9]. The program reads a digit as an input. If the digit is between 1
	// and 3, the program multiplies it by 10; if it is between 4 and 6,
	// multiplies it by 100; if it is between 7 and 9, multiplies it by 1000. If
	// it is zero or if the value is not a digit, the program must report an
	// error. Use a switch statement and at the end print the calculated new
	// value in the console

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String choice = scan.nextLine();

		switch (choice) {
		case "0":
			System.out.println("0 as input value is an error!!");
			break;
		case "1":
		case "2":
		case "3":
			System.out.println(Integer.parseInt(choice) * 10);
			break;
		case "4":
		case "5":
		case "6":
			System.out.println(Integer.parseInt(choice) * 100);
			break;
		case "7":
		case "8":
		case "9":
			System.out.println(Integer.parseInt(choice) * 1000);
			break;
		default:
			System.out.println("Not a digit value > 0 is an error!!");
			break;
		}
		scan.close();
	}
}