package javaPracticeNew;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateCountInArray {
	/*
	 * List<int[]> list1 = Arrays.asList(intArray);//Creates a list with a single obj(a int[]) element insted of list of obj
	 * List<Integer> list = Arrays.asList(integerArray);
	 * 
	 * IntStream intStream = Arrays.stream(intArray);
	 * Stream<Integer> stream = Arrays.stream(integerArray);
	 * Stream<String> stringStream = Arrays.stream(strArray);
	 */
	public static void main(String[] args) {
		//with out stream
		int[] array = { 12, 12, 13, 14, 34, 34, 5, 7, 34, 50, 50, 8, 9, 10 };

		Map<Integer, Integer> countMap = new HashMap<>();

		// Count occurrences of each number
		for (int num : array) {
			countMap.put(num, countMap.getOrDefault(num, 0) + 1);
		}

		System.out.println("Duplicate values and their counts:");

		// Print only duplicate numbers (count > 1)
		for (int key : countMap.keySet()) {
			if (countMap.get(key) > 1) { //get value of key
				System.out.println(key + " → " + countMap.get(key) + " times");
			}
		}

		//using stream
		Integer[] array2 = { 12, 12, 13, 14, 34, 34, 5, 7, 34, 50, 50, 8, 9, 10 };
		List<Integer> list = Arrays.asList(array2); // immutable
		System.out.println("Duplicate values count is:");
		list.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting())) // groupingby() create a Map i.e key value pairs
				.entrySet() //set of (key,value) pairs
				.stream().filter(entry -> entry.getValue() > 1)
				.forEach(entry -> System.out.println(entry.getKey() + " → " + entry.getValue() + " times"));

		// using stream but int[] array
		int[] array3 = { 12, 12, 13, 14, 34, 34, 5, 7, 34, 50, 50, 8, 9, 10 };
		System.out.println("Duplicate values count is:");
		Arrays.stream(array3) //  Convert to IntStream not 
				.boxed()     // Convert to Stream<Integer>
				.collect(Collectors.groupingBy(i -> i, Collectors.counting()))
				/*
				 * Collectors provides predefind collectors to accumulate elements from a stream into collections 	
				 */
				.entrySet().stream()
				.filter(entry -> entry.getValue() > 1)
				.forEach(entry -> System.out.println(entry.getKey() + " → " + entry.getValue() + " times"));
	}

}
