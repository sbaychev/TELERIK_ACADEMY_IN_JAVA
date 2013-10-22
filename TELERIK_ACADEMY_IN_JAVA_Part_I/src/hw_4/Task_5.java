package hw_4;

import java.util.Scanner;

public class Task_5 {

	// Write a program that gets two numbers from the console and prints the
	// greater of them. Don’t use if statements
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numOne = scan.nextInt();
		int numTwo = scan.nextInt();

		System.out.println(numOne > numTwo ? numOne : numTwo);

		scan.close();
	}
}