package javaPracticeNew;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingNumbers {
	public static void main(String[] args) {
		List<Integer> list =Arrays.asList(11,12,9,5,23,45,43,23);
		
		List<Integer> ascOrder=list.stream().distinct().sorted().collect(Collectors.toList());
		
		List<Integer> descOrder=list.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		List<Integer> descOrder1=list.stream().distinct().sorted((a,b)->b-a).collect(Collectors.toList());// sorted immutable and works on list set array etc.
		
		System.out.println("list is "+list);
		System.out.println("ascending order is "+ascOrder);
		System.out.println("decending order is "+descOrder);
		System.out.println("decending order is "+descOrder1);
		System.out.println("max from array is "+list.stream().max(Integer::compareTo).get());
		System.out.println("min from array is "+list.stream().min(Integer::compareTo).get());
	}

}
