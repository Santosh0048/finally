package javaPracticeNew;

import java.util.Arrays;

public class findMinValue {
	/*
	 * Arrays.sort(array);//modify array
     *Arrays.stream(array).sorted().toArray(); //with out modify array
     *System.out.println(Arrays.toString(array)); 
	 */
	public static void main(String[] args) {
		int[] number= {1};
		findSecondMin(number);
		
	}

	private static void findSecondMin(int[] number) {
		int result=Arrays.stream(number)
		.sorted()
		.skip(1)
		.findFirst()
		.orElseThrow(()->new IllegalArgumentException("No 2nd element found"));
		System.out.println(result);
		
	}

}
