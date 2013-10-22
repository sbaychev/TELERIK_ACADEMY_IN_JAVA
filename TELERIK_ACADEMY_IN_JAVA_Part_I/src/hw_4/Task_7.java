package hw_4;

import java.util.Scanner;

public class Task_7 {

	// Write a program that gets a number n and after that gets more n numbers
	// and calculates and prints their sum

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += scan.nextInt();
		}
		System.out.println(sum);
		scan.close();
	}
}