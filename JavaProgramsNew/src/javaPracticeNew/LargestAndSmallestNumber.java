package javaPracticeNew;

import java.util.Arrays;
import java.util.Comparator;

public class LargestAndSmallestNumber {

	public static void main(String[] args) {
		int number[] = { -10, -5, -4, -20, -10, -5 };
		int lowest = number[0];
		int highest = number[0];
		for (int i = 0; i < number.length; i++) {
			if (number[i] > highest) {
				highest = number[i];
			} else if (number[i] < lowest) {
				lowest = number[i];
			}
		}
		System.out.println("Largest & Lowest are "+highest+" , "+lowest);
		//using Streams
		Arrays.stream(number).boxed().distinct().sorted(Comparator.reverseOrder()).findFirst().ifPresent(System.out::println);
		Arrays.stream(number).boxed().distinct().sorted().findFirst().ifPresent(System.out::println);
	}
}
