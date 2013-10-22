package hw_4;

import java.math.BigInteger;

public class Task_9 {

	// Write a program to print the first 100 members of the sequence of
	// Fibonacci: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, …

	public static void main(String[] args) {

		// Scanner scan = new Scanner(System.in);
		int counter = 1;
		BigInteger first = new BigInteger("0");
		BigInteger second = new BigInteger("1");
		BigInteger third = new BigInteger("1");

		System.out.print("(" + counter + ")" + first);
		counter++;
		System.out.print(" (" + counter + ")" + second);
		counter++;
		System.out.print(" (" + counter + ")" + third);
		counter++;

		while (counter <= 100) {
			if (counter <= 100) {
				first = second.add(third);
				System.out.print(" (" + counter + ")" + first);
				counter++;
			}
			if (counter <= 100) {
				second = third.add(first);
				System.out.print(" (" + counter + ")" + second);
				counter++;
			}
			if (counter <= 100) {
				third = first.add(second);
				System.out.print(" (" + counter + ")" + third);
				counter++;
			}
		}
	}
}