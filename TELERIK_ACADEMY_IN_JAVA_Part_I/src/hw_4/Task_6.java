package hw_4;

import java.util.Scanner;

public class Task_6 {

	// Write a program that reads the coefficients a, b and c of a
	// quadratic equation ax2+bx+c=0 and solves it (prints its real roots).
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		float coefA = scan.nextFloat();
		float coefB = scan.nextFloat();
		float coefC = scan.nextFloat();

		float determinant = coefB * coefB - (4 * coefA * coefC);
		System.out.println("The determinant value:" + determinant);
		if (determinant < 0) {
			System.out.println("The equation has no real roots!");
		} else if (determinant == 0) {
			System.out.println("The equation has the same two real"
					+ " roots x1 = x2 = " + (-1) * coefB / 2);

		} else if (determinant > 0) {
			System.out.println("The equation has two real roots x1 = "
					+ ((-coefB + Math.sqrt(determinant)) / 2 * coefA)
					+ " and x2 = "
					+ ((-coefB - Math.sqrt(determinant)) / 2 * coefA));
		}
		scan.close();
	}
}