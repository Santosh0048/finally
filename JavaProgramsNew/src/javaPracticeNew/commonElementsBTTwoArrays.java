package javaPracticeNew;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class commonElementsBTTwoArrays {
	public static void main(String[] args) {
		int[] array1= {1,4,7,8,0};
		int[] array2= {2,4,5,6,8,9,0};
		findCommonElements(array1,array2);
	}

	private static void findCommonElements(int[] array1, int[] array2) {
		List<Integer> list=Arrays
				.stream(array1)
				.filter(i->Arrays.stream(array2).anyMatch(j->j==i))
				.boxed()
				.collect(Collectors.toList());
		System.out.println(list);
		
	}

}
