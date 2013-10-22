package hw_6;

public class Task_6 {

	// Write a program that, for a given two integer numbers N and X, calculates
	// the sumS = 1 + 1!/X + 2!/Xpow2 + … + N!/XN

	public static int fact(int num) {
		if (num == 1 || num == 0) {
			return 1;
		}
		return num * (fact(--num));
	}

	public static void main(String[] args) {

		int n = 3;
		int x = 2;
		double sum = 0;
		for (int i = 0; i <= n; i++) {
			sum += (fact(i)) / Math.pow(x, i);
		}
		System.out.println(sum);
	}
}