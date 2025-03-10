package javaPracticeNew;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemovesDuplicatesInIntArray {
	public static void main(String[] args) {
		int[] array = { 12, 12, 13, 14, 34, 34, 5, 7, 34, 50, 50, 8, 9, 10 };
		 Arrays.stream(array)
		.boxed()
		.distinct()
		.collect(Collectors.toList())
		.forEach(i->System.out.print(" "+i));
	}

}
