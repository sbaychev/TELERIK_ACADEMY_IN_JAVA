package hw_4;

import java.util.Scanner;

public class Task_1 {

	// Write a program that reads 3 integer numbers from the console and prints
	// their sum
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int one = scan.nextInt();
		int two = scan.nextInt();
		int three = scan.nextInt();
		System.out.format("%d + %d + %d = %d", one, two, three, one + two
				+ three);
		scan.close();
	}
}