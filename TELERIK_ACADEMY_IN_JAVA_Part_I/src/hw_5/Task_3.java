package hw_5;

public class Task_3 {

	// Write a program that finds the biggest of three integers using nested if
	// statements

	public static void main(String[] args) {

		int one = 4;
		int two = 2;
		int three = 3;
		// region OneCheck
		if (one > two) {
			if (one > three) {
				if (two > three) {
					System.out.println(one + " one " + two + " two " + three);
				} else {
					System.out.println(one + " one " + three + " three " + two);
				}
			} else {
				System.out.println(three + " three " + one + " one " + two);
			}
		}
		// endregion OneCheck

		// region TwoCheck
		else if (two > one) {
			if (two > three) {
				if (one > three) {
					System.out.println(two + " two " + one + " one " + three);
				} else {
					System.out.println(two + " two " + three + " three " + one);
				}
			} else {
				System.out.println(three + " three " + two + " two " + one);
			}
		}
		// endregion TwoCheck

		// region ThreeCheck
		else if (three > one) {
			if (three > two) {
				if (one > two) {
					System.out.println(three + " three " + one + " one " + two);
				} else {
					System.out.println(three + " three " + two + " two " + one);
				}
			} else {
				System.out.println(one + " one " + two + " two " + three);
			}
		}
		// endregion ThreeCheck
	}
}