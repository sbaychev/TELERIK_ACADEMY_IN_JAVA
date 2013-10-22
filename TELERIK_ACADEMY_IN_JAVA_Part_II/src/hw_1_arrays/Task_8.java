package hw_1_arrays;

public class Task_8 {

	// Write a program that finds the sequence of maximal sum in given array.
	// Example:
	// {2, 3, -6, -1, 2, -1, 6, 4, -8, 8}  {2, -1, 6, 4}
	// Can you do it with only one loop (with single scan through the elements
	// of the array)?

	public static void main(String[] args) {

		int array[] = { 2, 3, -6, -1, 2, -1, 6, 4, -8, 8 };

		int currentMaxSum = 0;
		int overallMaxSum = 0;
		int lastIndex = 0;
		int countIndexes = 0;

		for (int i = 0; i < array.length; i++) {
			if (currentMaxSum > overallMaxSum) {
				overallMaxSum = currentMaxSum;
				lastIndex = i - 1;
			}
			if (currentMaxSum + array[i] < currentMaxSum) {
				currentMaxSum = 0;
				countIndexes = 0;
				i -= 1;
			} else {
				currentMaxSum += array[i];
				countIndexes++;
			}
		}

		System.out.println(currentMaxSum);
		System.out.println(overallMaxSum);

		// for (int i = lastIndex - countIndexes; i < countIndexes; i++) {
		// System.out.print(" " + array[i]);
		// }
	}
}