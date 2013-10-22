package hw_1_arrays;

public class Task_9 {
	// Write a program that finds the most frequent number in an array. Example:
	// {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3}  4 (5 times)

	public static void selectSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {

					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {

		int[] array = { 4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3 };
		selectSort(array);
		int count = 1;
		int totalCount = 0;
		int number = Integer.MAX_VALUE;

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == array[i + 1]) {
				count++;
				if (count > totalCount) {
					number = array[i];
					totalCount = count;
				}

			} else {
				count = 1;
			}
		}
		// System.out.println(count);
		System.out.print(number + " (" + totalCount + " times)");
	}
}