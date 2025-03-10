package javaPracticeNew;

import java.util.Scanner;

public class CountTotalDigitInGivenNumber {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("enter number...");
			long number = scanner.nextLong();
			int count = getCountOfDigitInNumber(number);
			System.out.println("TotalDigitInGivenNumber " + number + " is " + count);
		}
	}

	private static int getCountOfDigitInNumber(long number) {
		int count = 0;
		while (number > 0) {
			{
				number = number / 10; //removes the last digit
				count++;
			}
		}
		return count;
	}
}
