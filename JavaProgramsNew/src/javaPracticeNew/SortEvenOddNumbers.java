package javaPracticeNew;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortEvenOddNumbers {
	public static void main(String[] args) {
		int[] input = { 23, 45, 24, 67, 68, 98, 24, 45, 77 };
		
		// Sorting even numbers in ascending order
		List<Integer> evenNumbers = Arrays.stream(input).filter(n -> n % 2 == 0) // Select even numbers
				.sorted()                                                        // Sort in ascending order
				.boxed()                                                         // Convert int to Integer
				.collect(Collectors.toList());

		// Sorting odd numbers in descending order
		List<Integer> oddNumbers = Arrays.stream(input).filter(n -> n % 2 != 0) // Select odd numbers
				.boxed()                                                        // Convert int to Integer
				.sorted((a, b) -> b - a)                                        // Sort in descending order
				.collect(Collectors.toList());

		System.out.println("Sorted Even Numbers: " + evenNumbers);
		System.out.println("Sorted Odd  Numbers: " + oddNumbers);
	}
}
