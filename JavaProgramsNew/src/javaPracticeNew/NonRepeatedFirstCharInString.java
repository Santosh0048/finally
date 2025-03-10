package javaPracticeNew;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatedFirstCharInString {
	public static void main(String[] args) {
		String value = "aaabbcddf";
		Character result=getNonRepeatedChar(value);
		System.out.println(result);
	}

	private static Character getNonRepeatedChar(String value) {
		return value.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))//to preserve order of 
				                                                                                    //first appearance use linkedhasmap
				.entrySet()
				.stream()
				.filter(entry -> entry.getValue() == 1)
				.map(Map.Entry::getKey)
				.findFirst()
				.orElseThrow(() -> new RuntimeException("Did not find any non-repeated character"));
		
		/*Map<Character, Integer> map = new LinkedHashMap<>();
		for (char ch : value.toCharArray()) {
			map.put(ch, map.containsKey(ch) ? map.get(ch) + 1 : 1);
		}
		boolean found = false;
		for (Entry<Character, Integer> entry : map.entrySet()) { //returns a Set of all key-value pairs (entries) present in a Map
			if (entry.getValue() == 1) {
				found=true; //if need all nonrepeated use this logic
				return entry.getKey();
				
			}
		}
		throw new RuntimeException("Did not find any non repeated character");*/
	}
}
