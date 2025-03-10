package javaPracticeNew;

import java.util.ArrayList;
import java.util.Scanner;
public class SubarrayWithSum {
	/*
	*ArrayList<ArrayList<Integer>> lets us store multiple subarrays.
	*The outer list stores all valid subarrays.
	*Each inner list represents one valid subarray.
	*/
	public static void main(String[] args) {
		// Example array input
		int[] inputArray = { 3, 55, 15, 30, 28, 11, 31 };

		// Dynamic input for target sum
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter target sum: "); //58
		int targetNumber = scanner.nextInt();

		// Find subarrays with given sum
		ArrayList<ArrayList<Integer>> subArrays = findSubarraysWithSum(inputArray, targetNumber);

		// Print the subarrays found
		if (!subArrays.isEmpty()) {
			System.out.println("Subarrays with sum " + targetNumber + ":");
			for (ArrayList<Integer> subArray : subArrays) {
				System.out.println(subArray);
			}
		} else {
			System.out.println("No subarrays found with sum " + targetNumber);
		}

		scanner.close();
	}

	private static ArrayList<ArrayList<Integer>> findSubarraysWithSum(int[] inputArray, int targetNumber) {
		ArrayList<ArrayList<Integer>> subArrays = new ArrayList<>();
		int currentSum = 0;
		int start = 0;

		// Iterate through the array
		for (int end = 0; end < inputArray.length; end++) {
			currentSum += inputArray[end]; // Add the current element

			// Shrink the window while sum exceeds the target
			while (currentSum > targetNumber && start <= end) {
				currentSum -= inputArray[start];
				start++;
			}

			// If exact sum is found, store the subarray
			if (currentSum == targetNumber) {
				ArrayList<Integer> subArray = new ArrayList<>();
				for (int j = start; j <= end; j++) {
					subArray.add(inputArray[j]);
				}
				subArrays.add(subArray);
			}
		}

		return subArrays;
	}
}
