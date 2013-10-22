package hw_4;

import java.util.Scanner;

public class Task_2 {
	// Write a program that reads the radius r of a circle and prints its
	// perimeter and area.

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float radius = scan.nextFloat();
		System.out.println(Math.PI * radius * radius);
		scan.close();
	}
}