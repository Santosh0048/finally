package javaPracticeNew;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArrayWithOutNewArray {
	public static void main(String[] args) {
		int[] array = { 12, 12, 13, 14, 34, 34, 5, 7 };
		reverseArray(array);
	}

	private static void reverseArray(int[] array) {
		IntStream.range(0, array.length/2)   // Loop from 0 to half of the array length
		.forEach(i->{                        // Iterate over each index in the first half
			int temp=array[i];               //Store the left-side value in a temporary variable
			array[i]=array[array.length-i-1];//Assign right-side value to left-side position
			array[array.length-i-1]=temp;    //Assign left-side value to right-side position
		});
		System.out.println(Arrays.toString(array));
	}
}
