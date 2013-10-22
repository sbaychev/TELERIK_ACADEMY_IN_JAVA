package hw_1_arrays;

public class Task_5 {
	// Write a program that finds the maximal increasing sequence in an array.
	// Example: {3, 2, 3, 4, 2, 2, 4}  {2, 3, 4}.

	public static void main(String[] args) {

		int[] array = { 3, 2, 3, 4, 2, 2, 4, 5, 6, 7 };
		int currentCountSeq = 0;
		int totalCountSeq = 0;
		int endSeqNum = Integer.MIN_VALUE;

		for (int i = 1; i < array.length; i++) {
			if (array[i - 1] == array[i] - 1) {
				++currentCountSeq;
				if (currentCountSeq > totalCountSeq) {
					totalCountSeq = currentCountSeq;
					endSeqNum = array[i];
				}
			} else {
				currentCountSeq = 0;
			}
		}
		// System.out.println(startSeqNum);
		// System.out.println(totalCountSeq);
		System.out.print("{");
		for (int i = 0; i < totalCountSeq + 1; i++) {
			if (i != totalCountSeq) {
				System.out.print((endSeqNum - totalCountSeq + i) + ", ");
			} else {
				System.out.print((endSeqNum - totalCountSeq + i));
			}
		}
		System.out.print("}");
	}
}