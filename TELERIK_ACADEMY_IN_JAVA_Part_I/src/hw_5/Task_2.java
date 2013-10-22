package hw_5;

public class Task_2 {

	// Write a program that shows the sign (+ or -) of the product of three real
	// numbers without calculating it. Use a sequence of if statements.

	public static void main(String[] args) {

		int one = -1;
		int two = -3;
		int three = -2;

		int sign = 0;

		if (one > 0) {
			++sign;
		} else {
			--sign;
		}
		if (two > 0) {
			++sign;
		} else {
			--sign;
		}
		if (three > 0) {
			++sign;
		} else {
			--sign;
		}

		if (sign > 0) {
			System.out.println("Positive");
		} else {
			System.out.println("Negative");
		}
	}
}