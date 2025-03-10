package javaPracticeNew;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDuplicateIntigers {
	public static void main(String[] args) {
		
        //duplicate from array using steams

		/*List<Integer> list1 = new ArrayList<>();
		Collections.addAll(list1, 12, 12, 13, 14, 34, 5, 7, 34, 34, 50, 8, 9, 10);  // mutable
		*/
//		List<Integer> list2 = new ArrayList<>(Arrays.asList(12, 12, 13, 14, 34, 5, 7, 34, 34, 50, 8, 9, 10));// mutable
		
//		List<Integer> list3 = List.of(12, 12, 13, 14, 34, 5, 7, 34, 34, 50, 8, 9, 10); // immutable java9+

//		List<Integer> list4 = Stream.of(12, 12, 13, 14, 34, 5, 7, 34, 34, 50, 8, 9, 10).collect(Collectors.toList()); // mutable
		
		List<Integer> list5 = new ArrayList<>(); // mutable
		int[] array1 = { 12, 12, 13, 14, 34, 34, 5, 7, 34, 50, 50, 8, 9, 10 };
		for (int num : array1) {
			list5.add(num);
		}
		Set<Integer> set = new HashSet<>();
		System.out.println("Duplicate values are:");
		list5.stream()
		.filter(i -> !set.add(i))
		.collect(Collectors.toSet())
		.forEach(i -> System.out.println(i));
		
		//duplicate from array with out stream
		int[] array = {12, 12, 13, 14, 34, 34, 5, 7, 34, 50, 50, 8, 9, 10 };
		Set<Integer> printed = new HashSet<>(); // To store already printed duplicates
		System.out.println("Duplicate values are:");
		for (int i = 0; i < array.length; i++) {

			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]&&!printed.contains(array[i])) {
					System.out.println(array[i]);
					printed.add(array[i]);
				}
			}
		}

	}
}
