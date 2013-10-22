package hw_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task_8 {

	// Write a program that calculates the greatest common divisor (GCD) of
	// given two numbers. Use the Euclidean algorithm (find it in Internet)

	public static List<Integer> divisors(int number) {
		List<Integer> divisors = new ArrayList<>();
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				divisors.add(i);
			}
		}
		return divisors;
	}

	public static void gcd(int numOne, int numTwo) {
		List<Integer> one = divisors(numOne);
		List<Integer> two = divisors(numTwo);
		int greatest = 0;
		for (int i = 0; i < one.size(); i++) {
			for (int j = 0; j < two.size(); j++) {
				if (one.get(i) == two.get(j)) {
					greatest = one.get(i);
				}
			}
		}
		System.out.println(greatest);
	}

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numOne = Integer.parseInt(br.readLine());
		int numTwo = Integer.parseInt(br.readLine());

		gcd(numOne, numTwo);

	}
}