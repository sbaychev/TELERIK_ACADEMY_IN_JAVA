package hw_1_arrays;

public class Task_4 {

	// Write a program that finds the maximal sequence of equal elements in an
	// array.
	// Example: {2, 1, 1, 2, 3, 3, 2, 2, 2, 1}  {2, 2, 2}.

	public static void main(String[] args) {
		int[] array = { 2, 1, 1, 1, 1, 2, 3, 3, 3, 3, 3, 2, 2, 2, 1 };
		int mostEqEl = 0;
		int maxMostEqEl = 0;
		int currentMaxEl = Integer.MIN_VALUE;
		for (int i = 1; i < array.length; i++) {
			if (array[i - 1] == array[i]) {
				++mostEqEl;
				if (mostEqEl > maxMostEqEl) {
					maxMostEqEl = mostEqEl;
					currentMaxEl = array[i];
				}
			} else {
				mostEqEl = 1;
			}
		}
		System.out.print("{");
		for (int i = 0; i < maxMostEqEl; i++) {
			if (i == maxMostEqEl - 1) {
				System.out.print(currentMaxEl + "}");
			} else {
				System.out.print(currentMaxEl + ", ");
			}
		}
	}
}