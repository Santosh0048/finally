package javaPracticeNew;

import java.util.Arrays;

public class ArrayStringLongestString {
	public static void main(String[] args) {
		String[] array = { "banana", "apple", "avocado", "apricot", "grapes" };
		findLongestString(array);
	}

	private static void findLongestString(String[] array) {
		int maxlength=Arrays.stream(array).mapToInt(String::length).max().orElse(0);
		System.out.println(maxlength);

	}
}
