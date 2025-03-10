package javaPracticeNew;

import java.util.stream.IntStream;

public class MaxNumberUsingGenerics {
	/*
	 * return type is T, meaning it depends on the input type.
	 * The restriction(Generic type constraints) 'T extends Comparable<T>' ensures that only types that implement 
	 * Comparable<T> (i.e., types that have a .compareTo() method) can be used(i.e Integer, String, Double, etc.)for Compile-time safety
	 * Generic allow us to write methods/classes that work with different data types while ensuring type safety at compile-time.
	 * Method parameters 'Comparator<? super T>', we allow comparators of T or any of its superclasses. i.e if  T is Integer allows Number also.
	 */
	public static void main(String[] args) {
		Integer[] arrayInt= {10,15,12,17,10};
		String[] arrayString= {"apple","banana","orange"};
		Integer maxNumber=findMax(arrayInt);
		String maxString=findMax(arrayString);
		System.out.println("max Number is "+maxNumber);
		System.out.println("max String is "+maxString);
	} 

	private static <T extends Comparable<T>> T findMax(T[] array) {
		if (array.length==0 || array==null) {
			return null;	
		}
		T max=array[0];
		for (int i = 0; i < array.length; i++) { 
			if (array[i].compareTo(max)>0) {     //> 0 (positive) → array[i] is greater than max (update max).
				                                 //< 0 (negative) → array[i] is smaller than max (keep max).
				                                 //0 → Both values are equal (no update needed).
				max=array[i];                    //String compares characters lexicographically (like a dictionary)
			}
		}
		/*Optional<T>
		 *T is the type of value it can hold.
		 *If T is present, Optional<T> contains a value.
		 *If T is absent, Optional<T> is empty.Prevents NullPointerException
		 *Use Optional<T> to avoid null checks.
         *Use orElse() or orElseGet() to provide default values safely.
         *Use ifPresent() and map() for functional-style handling.
         *Avoid using Optional for method parameters and class fields.
		 */
		max=IntStream.range(0, array.length)//Iterates through array indices
				.mapToObj(i->array[i])      //Converts each index to its corresponding array value
				.max(Comparable::compareTo) //Finds the maximum using compareTo(), which is valid for Strings
				.get();
		return max;
	}
}
