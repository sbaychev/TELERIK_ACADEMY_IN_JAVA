package hw_6;

public class Task_2 {

	// Write a program that prints all the numbers from 1 to N, that are not
	// divisible by 3 and 7 at the same time

	public static void main(String[] args) {

		// Scanner scan = new Scanner(System.in);
		// int n = scan.nextInt();

		int n = 37;

		for (int i = 1; i < n; i++) {

			if (i % 3 == 0 && i % 7 == 0) {
				System.out.print(i + " ");
			}
		}
		// scan.close();
	}
}