package hw_6;

public class Task_4 {

	// Write a program that calculates N!/K! for given N and K (1<K<N).

	public static int fact(int num) {
		if (num == 1) {
			return 1;
		}
		return num * (fact(--num));
	}

	public static void main(String[] args) {

		int n = 4;
		int k = 3;

		int calc = fact(n) / fact(k);
		System.out.println(calc);

	}
}