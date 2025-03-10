package javaPracticeNew;

import java.util.Scanner;
/*
 *ArmstrongNumber also called Narcissistic Number, Pluperfect Digital Invariant (PPDI), or Digit Power Sum.
 *i.enumber that is equal to the sum of its own digits each raised to the power of the number of digits.
 */
public class IsArmstrongNumber {

	// Method to check if a number is an Armstrong number
	public static void isArmstrongNumber(int num) {
		if (num < 0) {
			System.out.println(num + " is not a valid input.");
			return;
		}

		int sum = 0, temp = num, digits = String.valueOf(num).length();

		// Calculate the sum of digits raised to the power of number of digits
		while (temp > 0) {
			int digit = temp % 10;
			sum += Math.pow(digit, digits);
			temp /= 10;
		}

		// Compare sum with original number
		if (sum == num) {
			System.out.println(num + " is an Armstrong Number.");
		} else {
			System.out.println(num + " is not an Armstrong Number.");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number to check: ");
		int number = scanner.nextInt();

		isArmstrongNumber(number);

		scanner.close();
	}
}
