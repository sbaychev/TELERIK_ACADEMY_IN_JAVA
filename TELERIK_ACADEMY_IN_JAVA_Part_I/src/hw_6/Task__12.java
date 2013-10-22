package hw_6;

public class Task__12 {

	// Write a program that reads from the console a positive integer number N
	// (N < 20) and outputs a matrix like the following:
	// N = 3.........N = 4

	// 1 2 3........1 2 3 4
	// 2 3 4........2 3 4 5
	// 3 4 5........3 4 5 6
	// .............4 5 6 7
	public static void main(String[] args) {

		int N = 3;

		for (int i = 0; i < N; i++) {

			for (int j = i + 1; j <= N + i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}