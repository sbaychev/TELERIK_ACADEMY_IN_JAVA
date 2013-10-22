package hw_6;

public class Task_9_10 {

	// In the combinatorial mathematics, the Catalan numbers are calculated by
	// the following formula:
	// Cn = ( 1/ (n + 1) ) (2n n) = 2n! / (n + 1)!n! for n => 0

	// Catalan numbers: 1, 2, 5, 14, 42, 132, 429, 1430, 4862, 16796, 58786,
	// 208012, 742900, 2674440, 9694845, ...

	public static int fact(int num) {
		if (num == 1 || num == 0) {
			return 1;
		}
		return num * (fact(--num));
	}

	public static void main(String[] args) {

		int N = 3;
		System.out.println((fact(2 * N)) / (fact(N + 1) * fact(N)));
	}
}