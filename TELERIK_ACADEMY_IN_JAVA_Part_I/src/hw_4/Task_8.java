package hw_4;

import java.util.Scanner;

public class Task_8 {

	// Write a program that reads an integer number n from the console and
	// prints all the numbers in the interval [1..n], each on a single line
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		System.out.print("[");
		for (int i = 1; i < n; i++) {
			System.out.print(i + " ");
		}
		System.out.print(n + "]");
		scan.close();
	}
}