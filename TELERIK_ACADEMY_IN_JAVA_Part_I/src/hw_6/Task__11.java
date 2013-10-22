package hw_6;

public class Task__11 {

	// Write a program that prints all possible cards from a standard deck of 52
	// cards (without jokers). The cards should be printed with their English
	// names. Use nested for loops and switch-case.

	public static void main(String[] args) {
		String[] cardNames = { "Two", "Three", "Four", "Five", "Six", "Seven",
				"Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace" };
		String[] cardColors = { "Clubs", "Diamonds", "Hearts", "Spades" };
		// int lengthCardColors = cardColors.length;
		for (int i = 0; i < cardNames.length; i++) {
			for (int j = 0; j < cardColors.length; j++) {
				System.out.print(" " + cardNames[i] + " of " + cardColors[j]);
			}
			System.out.println();
		}
	}
}