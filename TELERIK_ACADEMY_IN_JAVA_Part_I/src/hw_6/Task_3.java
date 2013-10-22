package hw_6;

import java.util.Scanner;

public class Task_3 {

	// Write a program that reads from the console a sequence of N integer
	// numbers and returns the minimal and maximal of them

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] sequence = new int[n];

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			sequence[i] = scan.nextInt();
			if (sequence[i] < min) {
				min = sequence[i];
			}
			if (sequence[i] > max) {
				max = sequence[i];
			}
		}
		scan.close();
		System.out.println("min " + min);
		System.out.println("max " + max);
	}
}