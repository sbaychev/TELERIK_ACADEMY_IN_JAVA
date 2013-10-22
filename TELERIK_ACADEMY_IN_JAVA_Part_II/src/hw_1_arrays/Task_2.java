package hw_1_arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_2 {

	// Write a program that reads two arrays from the console and compares them
	// element by element

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<String> arrOne = new ArrayList<String>();
		List<String> arrTwo = new ArrayList<String>();
		// int i = 0;
		String line = null;
		while (scan.hasNextLine() && !(line = scan.nextLine()).isEmpty()) {

			try {
				arrOne.add((line));
			} catch (NumberFormatException e) {
				break;
			}
		}
		while (scan.hasNextLine() && !(line = scan.nextLine()).isEmpty()) {

			try {
				arrTwo.add((line));
			} catch (NumberFormatException e) {
				break;
			}
		}
		scan.close();
		if (arrOne.size() < arrTwo.size()) {
			System.out
					.println("Array One is lexicographically before Array Two");
		} else if (arrOne.size() > arrTwo.size()) {
			System.out
					.println("Array One is lexicographically after Array Two");
		} else {
			for (int i = 0; i < arrOne.size(); i++) {
				if (arrOne.get(i).compareTo(arrTwo.get(i)) < 0) {
					System.out
							.println("Array One is lexicographically before Array Two");
					break;
				} else if (arrOne.get(i).compareTo(arrTwo.get(i)) > 0) {
					System.out
							.println("Array One is lexicographically after Array Two");
					break;
				} else if (arrOne.get(i).compareTo(arrTwo.get(i)) == 0
						&& i == arrOne.size() - 1) {
					System.out
							.println("Array One is lexicographically equal to Array Two");
				}
			}
		}
	}
}