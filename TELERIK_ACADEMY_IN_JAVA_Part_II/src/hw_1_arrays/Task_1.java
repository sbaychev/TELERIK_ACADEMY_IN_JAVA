package hw_1_arrays;

public class Task_1 {

	// Write a program that allocates array of 20 integers and initializes each
	// element by its index multiplied by 5. Print the obtained array on the
	// console

	public static void main(String[] args) {
		int[] intArr = new int[20];
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = i * 5;
		}
		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}
	}
}