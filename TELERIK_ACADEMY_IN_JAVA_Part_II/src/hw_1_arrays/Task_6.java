package hw_1_arrays;

import java.util.Scanner;

public class Task_6 {

	// Write a program that reads two integer numbers N and K and an array of N
	// elements from the console. Find in the array those K elements that have
	// maximal sum.

	public static void q_sort(int left, int right, int[] arr) {
		int pivot, l_hold, r_hold;

		l_hold = left;
		r_hold = right;
		pivot = arr[left];

		while (left < right) {
			while ((arr[right] >= pivot) && (left < right)) {
				right--;
			}

			if (left != right) {
				arr[left] = arr[right];
				left++;
			}

			while ((arr[left] <= pivot) && (left < right)) {
				left++;
			}

			if (left != right) {
				arr[right] = arr[left];
				right--;
			}
		}
		arr[left] = pivot;
		pivot = left;
		left = l_hold;
		right = r_hold;

		if (left < pivot) {
			q_sort(left, pivot - 1, arr);
		}

		if (right > pivot) {
			q_sort(pivot + 1, right, arr);
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int K = scan.nextInt(); // keeping in mind that K < N

		int[] array = new int[N];
		for (int i = 0; i < N; i++) {
			array[i] = scan.nextInt();
		}
		scan.close();

		q_sort(0, array.length - 1, array);

		// for (int i = 0; i < array.length; i++) {
		// System.out.print(array[i] + " ");
		// }
		// System.out.println();
		for (int j = K; j > 0; j--) {
			System.out.print((array[array.length - j]) + " ");
		}

	}
}