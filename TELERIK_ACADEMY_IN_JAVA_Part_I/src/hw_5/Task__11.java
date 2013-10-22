package hw_5;

public class Task__11 {

	/*
	 * Write a program that converts a number in the range [0...999] to a text
	 * corresponding to its English pronunciation. Examples:
	 * 
	 * 0  "Zero" 273  "Two hundred seventy three" 400  "Four hundred" 501 
	 * "Five hundred and one" 711  "Seven hundred and eleven"
	 */
	public static void hundreds(Integer number) {
		int hundreds = Character.getNumericValue(number.toString().charAt(0));
		switch (hundreds) {
		case 1:
			System.out.print("one hundred ");
			break;
		case 2:
			System.out.print("two hundred ");
			break;
		case 3:
			System.out.print("three hundred  ");
			break;
		case 4:
			System.out.print("four hundred ");
			break;
		case 5:
			System.out.print("five hundred ");
			break;
		case 6:
			System.out.print("six hundred ");
			break;
		case 7:
			System.out.print("seven hundred ");
			break;
		case 8:
			System.out.print("eight hundred ");
			break;
		case 9:
			System.out.print("nine hundred ");
			break;
		}
		tens(number);
	}

	public static void tens(Integer number) {
		int tens = Character.getNumericValue(number.toString().charAt(1));
		switch (tens) {
		case 1:
			tensElves(number);
			break;
		case 2:
			System.out.print("and twenty");
			ones(number);
			break;
		case 3:
			System.out.print("and thirty");
			ones(number);
			break;
		case 4:
			System.out.print("and forty");
			ones(number);
			break;
		case 5:
			System.out.print("and fifty");
			ones(number);
			break;
		case 6:
			System.out.print("and sixty");
			ones(number);
			break;
		case 7:
			System.out.print("and seventy");
			ones(number);
			break;
		case 8:
			System.out.print("and eighty");
			ones(number);
			break;
		case 9:
			System.out.print("and ninety");
			ones(number);
			break;
		}
	}

	public static void tensElves(Integer number) {
		int tensElves = Character.getNumericValue(number.toString().charAt(1)
				+ number.toString().charAt(2));
		switch (tensElves) {
		case 10:
			System.out.print("and ten");
			break;
		case 11:
			System.out.print("and eleven");
			break;
		case 12:
			System.out.print("and twelve");
			break;
		case 13:
			System.out.print("and thirteen");
			break;
		case 14:
			System.out.print("and fourteen");
			break;
		case 15:
			System.out.print("and fifteen");
			break;
		case 16:
			System.out.print("and sixteen");
			break;
		case 17:
			System.out.print("and seventeen");
			break;
		case 18:
			System.out.print("and eighteen");
			break;
		case 19:
			System.out.print("and nineteen");
			break;
		}
	}

	public static void ones(Integer number) {
		int ones = Character.getNumericValue(number.toString().charAt(2));
		switch (ones) {
		case 1:
			System.out.print(" one");
			break;
		case 2:
			System.out.print(" two");
			break;
		case 3:
			System.out.print(" three");
			break;
		case 4:
			System.out.print(" four");
			break;
		case 5:
			System.out.print(" five");
			break;
		case 6:
			System.out.print(" six");
			break;
		case 7:
			System.out.print(" seven");
			break;
		case 8:
			System.out.print(" eight");
			break;
		case 9:
			System.out.print(" nine");
			break;
		}
	}

	public static void main(String[] args) {

		Integer number = 999;
		if (number.toString().length() == 3) {
			hundreds(number);
		} else if (number.toString().length() == 2) {
			tens(number);
		} else if (number.toString().length() == 1) {
			ones(number);
		}
	}
}