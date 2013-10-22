package hw_6;

public class Task_5 {

	// Write a program that calculates N!*K! / (K-N)! for given N and K (1<N<K).
	public static int fact(int num) {
		if (num == 1) {
			return 1;
		}
		return num * (fact(--num));
	}

	public static void main(String[] args) {

		int n = 3;
		int k = 4;

		System.out.println((fact(n) * fact(k)) / (fact(k - n)));
	}
}