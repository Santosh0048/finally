package javaPracticeNew;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsInString {
	public static void main(String[] args) {
		String value = "hs hsvg ahs hs hs ga uj uj ga";
		Map<String, Integer> map = new HashMap<>();
		String words[] = value.split(" ");
		for (String word : words) {
			map.put(word, map.containsKey(word) ? map.get(word) + 1 : 1); //ternary operator expression
//			map.put(word, map.getOrDefault(word, 0) + 1);
		}
			for (Map.Entry<String, Integer> entry : map.entrySet()) { //returns a Set of all key-value pairs (entries) present in a Map
				if (entry.getValue() > 1) {
					System.out.println(entry.getKey() + " : " + entry.getValue());
				}
			}
			/*Set<String> keys = map.keySet();
			for (String key : keys) {
				if (map.get(key)>1) {
					System.out.println(key + " : " + map.get(key));
				}
			}*/
		}
	}

