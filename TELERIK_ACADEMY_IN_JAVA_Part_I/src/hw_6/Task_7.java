package hw_6;

import java.math.BigInteger;
import java.util.Scanner;

public class Task_7 {

	// Write a program that reads a number N and calculates the sum of the first
	// N members of the sequence of Fibonacci: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,
	// 55, 89, 144, 233, 377, …
	// Each member of the Fibonacci sequence (except the first two) is a sum of
	// the previous two members

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.close();

		int counter = 1;
		BigInteger first = new BigInteger("0");
		BigInteger second = new BigInteger("1");
		BigInteger third = new BigInteger("1");

		BigInteger sumNFib = new BigInteger("0");

		if (N <= 3) {
			if (N == 0) {
				System.out.println(0);
			} else if (N == 1) {
				System.out.println(first);
			} else if (N == 2) {
				System.out.println(first.add(second));
			} else if (N == 3) {
				System.out.println(third.add(first.add(second)));
			}
		} else {
			sumNFib = sumNFib.add(first);
			counter++;
			sumNFib = sumNFib.add(second);
			counter++;
			sumNFib = sumNFib.add(third);
			counter++;

			while (counter <= N) {
				if (counter <= N) {
					first = second.add(third);
					sumNFib = sumNFib.add(first);
					counter++;
				}
				if (counter <= N) {
					second = third.add(first);
					sumNFib = sumNFib.add(second);
					counter++;
				}
				if (counter <= N) {
					third = first.add(second);
					sumNFib = sumNFib.add(third);
					counter++;
				}
			}
			System.out.println(sumNFib);
		}
	}
}