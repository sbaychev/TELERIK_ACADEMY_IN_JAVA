package hw_1_arrays;

public class Task__10 {

	// Write a program that finds in given array of integers a sequence of given
	// sum S (if present). Example: {4, 3, 1, 4, 2, 5, 8}, S=11  {4, 2, 5}

	public static void main(String[] args) {
		int[] arr = { 4, 3, 1, 4, 2, 5, 8 };
		int S = 11;
		int curSum = 0;
		int timesBegin = 0;
		int startIndex = Integer.MIN_VALUE;
		int endIndex = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if ((curSum += arr[i]) == S) {
				endIndex = i;
				break;
			} else if ((curSum += arr[i]) > S) {
				startIndex = i = 0 + timesBegin++;

			}
		}
	}
}