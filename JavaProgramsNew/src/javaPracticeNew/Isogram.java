package javaPracticeNew;

import java.util.HashSet;
import java.util.Set;

/*
 * no letter appears more than once
 */
public class Isogram {
	public static void main(String[] args) {
		String name="santosh"; // Case Sensitive
		isIsogram(name);
	}

	private static void isIsogram(String name) {
		Set<Character> set= new HashSet<>();
		for (int i = 0; i < name.length(); i++) {
			set.add(name.charAt(i));
		}
		if (name.length()==set.size()) {
			System.out.println("given String is Isogram");
		}else {
			System.out.println("given String is  NOT aIsogram");
				
			}
	}

}
