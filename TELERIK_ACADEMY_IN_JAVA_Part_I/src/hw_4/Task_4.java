package hw_4;

import java.util.Scanner;

public class Task_4 {

	// Write a program that reads two positive integer numbers and prints how
	// many numbers p exist between them such that the reminder of the division
	// by 5 is 0 (inclusive). Example: p(17,25) = 2.

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int numOne = scan.nextInt();
		int numTwo = scan.nextInt();
		int p = 0;

		for (int i = numOne; i <= numTwo; i++) {
			if (i % 5 == 0) {
				p++;
			}
		}
		System.out.format("p(%d, %d) = %d", numOne, numTwo, p);
		scan.close();
	}
}