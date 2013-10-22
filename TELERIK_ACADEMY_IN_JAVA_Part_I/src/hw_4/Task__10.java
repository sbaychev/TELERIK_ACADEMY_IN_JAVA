package hw_4;

public class Task__10 {

	// Write a program to calculate the sum (with accuracy of 0.001): 1 + 1/2 -
	// 1/3 + 1/4 - 1/5 + ...
	// In mathematics, the n-th harmonic number is the sum of the reciprocals of
	// the first n natural numbers alternating harmonic numbers
	public static void main(String[] args) {
		double accuracy = 0.001;
		double curSum = 1 + (double) 1 / 2;
		double firSum = 0.0;

		for (int i = 1; Math.abs(curSum - firSum) > accuracy; i++) {
			firSum = curSum;
			double nHar = (double) (1 / ((i + 2) * (Math.pow((-1), i))));
			curSum += nHar;
		}

		System.out.format("The sum with accuracy of 0.001 is: %.3f", curSum);
	}
}