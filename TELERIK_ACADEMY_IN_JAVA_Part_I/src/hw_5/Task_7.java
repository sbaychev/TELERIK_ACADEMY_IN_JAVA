package hw_5;

public class Task_7 {

	// Write a program that finds the greatest of given 5 variables

	public static void main(String[] args) {

		int var1 = 11;
		int var2 = 2;
		int var3 = 3;
		int var4 = 4;
		int var5 = 5;

		int greatest = Integer.MIN_VALUE;

		if (var1 > greatest) {
			greatest = var1;
		}
		if (var2 > greatest) {
			greatest = var2;
		}
		if (var3 > greatest) {
			greatest = var3;
		}
		if (var4 > greatest) {
			greatest = var4;
		}
		if (var5 > greatest) {
			greatest = var5;
		}
		System.out.println(greatest);
	}
}