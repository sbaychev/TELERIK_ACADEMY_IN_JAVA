package hw_1_arrays;

public class Task_7 {

	// Sorting an array means to arrange its elements in increasing order. Write
	// a program to sort an array. Use the "selection sort" algorithm: Find the
	// smallest element, move it at the first position, find the smallest from
	// the rest, move it at the second position, etc.

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

		int[] array = { 1, 4, 2, 0, 55, 22, 3, 11, 6, 5 };
		selectSort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}