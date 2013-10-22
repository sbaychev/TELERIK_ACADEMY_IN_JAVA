package hw_5;

import java.util.Scanner;

//Write an if statement that examines two integer variables and exchanges 
//their values if the first one is greater than the second one

public class Task_1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int one = scan.nextInt();
		int two = scan.nextInt();

		if (one > two) {

			one ^= two;
			two ^= one;
			one ^= two;
		}

		System.out.println(one);
		System.out.println(two);
		scan.close();
	}
}
